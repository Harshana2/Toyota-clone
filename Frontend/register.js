document.getElementById('registrationForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const firstname = document.getElementById('firstname').value;
    const lastname = document.getElementById('lastname').value;
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;
    

    axios.post('http://localhost:8080/api/user/add', {
        firstname: firstname,
        lastname: lastname,
        username: username,
        password:password,
        email:email,
        mobile:mobile
    })
    .then(function (response) {
        console.log('Success:', response.data);
        alert('Registration successful!');
        window.location.href='login.html';
    })
    .catch(function (error) {
        console.error('Error:', error);
        alert('Registration failed. Please try again.');
    });
});