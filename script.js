function authenticateUser() {
    const loginId = document.getElementById('login_id').value;
    const password = document.getElementById('password').value;

            fetch('https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    "login_id": "test@sunbasedata.com",
                    "password": "Test@123"
                })
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Authentication failed');
                }
                return response.json();
            })
            .then(data => {
                authToken = data.token;
                showCustomerListScreen();
            })
            .catch(error => {
                document.getElementById('loginError').textContent = 'Authentication failed. Please check your credentials.';
            });
    
    // Make a POST request to the authentication API
    // Use fetch or XMLHttpRequest to send the credentials and handle the response
    // If authentication is successful, save the bearer token in a variable and proceed to the next screen
}

// Define a variable to store the bearer token obtained during authentication
let authToken = "";

// Function to load the Customer List Screen
function loadCustomerListScreen() {
    // Use fetch or XMLHttpRequest to make a GET request to retrieve the customer list
    // Include the bearer token in the request header
    // Display the customer data in the table
    // Handle any errors that may occur
}

// Function to load the Add New Customer Screen
function loadAddCustomerScreen() {
    // Redirect to the Add New Customer Screen
}

// Function to create a new customer
function createCustomer() {
    // Get customer data from the form
    // Make a POST request to create a new customer
    // Include the bearer token in the request header
    // Handle the response and display a success or error message
}
