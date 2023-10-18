document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('survey-form');
    const popup = document.getElementById('popup');
    const closePopupButton = document.getElementById('close-popup');

    form.addEventListener('submit', function (event) {
        event.preventDefault();
        // Get values from the form
        const firstName = document.getElementById('first-name').value;
        const lastName = document.getElementById('last-name').value;
        const dateOfBirth = document.getElementById('date-of-birth').value;
        const country = document.getElementById('country').value;
        const gender = document.querySelector('input[name="gender"]:checked').value;
        const profession = document.getElementById('profession').value;
        const email = document.getElementById('email').value;
        const mobile = document.getElementById('mobile').value;

        // Display values in the popup
        document.getElementById('popup-first-name').textContent = firstName;
        document.getElementById('popup-last-name').textContent = lastName;
        document.getElementById('popup-date-of-birth').textContent = dateOfBirth;
        document.getElementById('popup-country').textContent = country;
        document.getElementById('popup-gender').textContent = gender;
        document.getElementById('popup-profession').textContent = profession;
        document.getElementById('popup-email').textContent = email;
        document.getElementById('popup-mobile').textContent = mobile;

        // Show the popup
        popup.style.display = 'block';
    });

    closePopupButton.addEventListener('click', function () {
        popup.style.display = 'none';
        form.reset();
    });

    document.getElementById('reset-button').addEventListener('click', function () {
        form.reset();
    });
});
