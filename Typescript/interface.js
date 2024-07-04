document.addEventListener('DOMContentLoaded', function () {
    var form = document.getElementById('userForm');
    form.addEventListener('submit', function (event) {
        event.preventDefault();
        var formData = new FormData(form);
        var user = {
            firstName: formData.get('firstName'),
            lastName: formData.get('lastName'),
            email: formData.get('email'),
            gender: formData.get('gender'),
            mobileNumber: formData.get('mobileNumber'),
            password: formData.get('password')
        };
        console.log(user);
    });
});
