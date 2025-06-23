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
    .then(() => loadTableData())
    .catch(error => console.error('Error:', error));
});

// Function to load data and populate the table
function loadTableData() {
    fetch('http://localhost:8080/users/get')
        .then(response => response.json())
        .then(data => {
            const tableBody = document.querySelector('#data-table tbody');
            tableBody.innerHTML = ""; // Clear previous rows
            data.forEach(user => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${user.id}</td>
                    <td>${user.userId}</td>
                    <td>
                        <button style="background: #e74c3c; color: #fff; border: none; border-radius: 4px; padding: 6px 12px; cursor: pointer;" onclick="deleteUser(${user.id})">Delete</button>
                    </td>
                `;
                tableBody.appendChild(row);
            });
        })
        .catch(error => console.error('Error fetching data:', error));
}

// Delete user function
function deleteUser(id) {
    fetch(`http://localhost:8080/users/delete/${id}`, {
        method: 'DELETE'
    })
    .then(() => loadTableData())
    .catch(error => console.error('Error deleting user:', error));
}

// Initial load
window.onload = loadTableData;




