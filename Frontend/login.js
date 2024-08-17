document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    axios.post('http://localhost:8080/api/user/login', {
        username: username,
        password: password
    })
    .then(function (response) {
        console.log('Success:', response.data);
        alert('Login successful!');
        window.location.href = 'home.html'
    })
    .catch(function (error) {
        console.error('Error:', error);
        if (error.response) {
            alert('Login failed: ' + error.response.data);
        } 
    });
});
