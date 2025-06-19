document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission

    const userId = document.getElementById("userId").value;
    const password = document.getElementById("password").value;

    const user = { userId, password };

    fetch('http://localhost:8080/users/save', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(user => console.log('Success:', user))
    .catch(error => console.error('Error:', error));
});

