document.getElementById('costOfLivingForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const currentCity = document.getElementById('currentCity').value;
    const currentState = document.getElementById('currentState').value;
    const currentSalary = document.getElementById('currentSalary').value;
    const targetCity = document.getElementById('targetCity').value;
    const targetState = document.getElementById('targetState').value;

    const currentLocation = `${currentCity}, ${currentState}`;
    const targetLocation = `${targetCity}, ${targetState}`;

    const requestData = {
        currentLocation: currentLocation,
        targetLocation: targetLocation,
        salary: currentSalary
    };

    fetch('http://localhost:8080/api/calculate', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(requestData)
    })
        .then(response => {
            if (!response.ok) {
                return response.json().then(err => { throw err; });
            }
            return response.json();
        })
        .then(data => {
            document.getElementById('result').innerHTML = `
        <div class="alert alert-success" role="alert">
            To maintain the same standard of living, you would need to earn $${data.equivalentSalary.toFixed(2)} in ${data.targetCity}.
        </div>
        `;
        })
        .catch(error => {
            console.error('Error:', error);
            let errorMessage = 'Unable to calculate the cost of living. Please try again.';
            if (error.error) {
                errorMessage = error.error;
            }
            document.getElementById('result').innerHTML = `
        <div class="alert alert-danger" role="alert">
            Error: ${errorMessage}
        </div>
        `;
        });
});