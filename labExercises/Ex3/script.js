function validateData() {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    var dataBase = {
        "users": [
            {
                "email": "user1@gmail.com",
                "password": "password",
                "name": "Tim"
            },
            {
                "email": "user2@example.com",
                "password": "password",
                "name": "Tommy"
            }
        ]
    };


    var userFound = dataBase.users.some(function (user) {
        return user.email === email && user.password === password;
    });

    if (!userFound) {
        // alert("Invalid Email and password!!!");
        alert("INVALID DATA\nCorrect username: user1@gmail.com \nCorrect password: password")
    } else {
        window.location = "https://github.com/tommyboiii004";
    }
}