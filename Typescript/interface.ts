interface User {
    firstName: string;
    lastName: string;
    email: string;
    gender: string;
    mobileNumber: string;
    password: string;
}
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('userForm') as HTMLFormElement;
    form.addEventListener('submit', (event: Event) => {
        event.preventDefault();
        const formData = new FormData(form);
        const user: User = {
            firstName: formData.get('firstName') as string,
            lastName: formData.get('lastName') as string,
            email: formData.get('email') as string,
            gender: formData.get('gender') as string,
            mobileNumber: formData.get('mobileNumber') as string,
            password: formData.get('password') as string
        };
        console.log(user);
    });
});