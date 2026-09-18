# Problem Statement: Smart Crop Advisor & Profit Predictor (AgriWise)

## Problem Statement
Small and mid-scale farmers frequently face financial losses due to unpredictable weather patterns, volatile market prices, and a lack of data-driven crop selection. Traditional farming methods rely heavily on intuition rather than scientific metrics. There is a critical need for an automated, data-informed advisory system that can recommend the most profitable crops based on regional soil and weather data, while providing actionable cultivation guidelines.

## Target Users
*   **Farmers / Agricultural Workers:** To input their land details and receive simple, profitable crop recommendations and step-by-step SOPs.
*   **NGOs / Agricultural Extension Officers:** To assist rural farmers by calculating expected yields and net profits using real-time market data.
*   **Agri-Consultants:** To quickly analyze regional soil metrics and historical weather trends without manual calculations.

## Scope of the Project
The scope of this project is to build a Command-Line Interface (CLI) application in Core Java that acts as an intelligent agricultural advisory engine. It focuses on parsing historical datasets (CSV files), applying business logic to predict crop suitability, and estimating financial returns based on current Mandi prices. It does not include a graphical user interface (GUI) or a web-based database architecture.

## High-level Features
*   **Data-Driven Crop Prediction:** Dynamically evaluates regional weather and soil metrics to suggest the most suitable crops for a given season (Kharif/Rabi).
*   **Automated Cultivation Advisory:** Generates detailed, crop-specific Standard Operating Procedures (SOPs), including seed treatment and fertilizer ratios.
*   **Profit Analytics:** Calculates estimated input costs against real-time market prices to project accurate net profits for the user's specific land size.
*   **Flat-File Dataset Integration:** Parses large local CSV datasets (`historical_weather.csv`, `soil_metrics.csv`, `mandi_price.csv`) to power the recommendation engine without requiring an active internet connection or SQL database.