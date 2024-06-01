document.addEventListener("DOMContentLoaded", () => {
    console.log("script loaded");

    // Set theme to local storage
    function setTheme(theme) {
        localStorage.setItem("theme", theme);
    }

    // Get theme from local storage
    function getTheme() {
        let theme = localStorage.getItem("theme");
        // Ternary operator to return the theme or "light" if no theme is found
        return theme ? theme : "light";
    }

    let currentTheme = getTheme();

    // Initial theme setup
    applyTheme(currentTheme);

    // Function to change the theme
    function applyTheme(theme) {
        // Remove all previous theme classes
        document.querySelector('html').className = '';
        // Set the current theme to the web page
        document.querySelector('html').classList.add(theme);
    }

    // Function to handle theme change
    function changeTheme() {
        // Set the listener to the change theme button
        const changeThemeButton = document.querySelector("#theme_change_button");
        if (!changeThemeButton) {
            console.error("Change theme button not found");
            return;
        }

        changeThemeButton.addEventListener("click", (event) => {
            console.log("change theme button clicked");

            // Toggle the theme
            currentTheme = currentTheme === "dark" ? "light" : "dark";

            // Update the local storage
            setTheme(currentTheme);

            // Apply the new theme
            applyTheme(currentTheme);

            // Change the text of the button
            changeThemeButton.querySelector('span').textContent = currentTheme === "light" ? "Dark" : "Light";
        });
    }

    // Initialize the change theme button functionality
    changeTheme();
});
