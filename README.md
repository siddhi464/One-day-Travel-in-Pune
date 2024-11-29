# Projects 1 - One Day Travel in Pune

README: Daily Tour Planner

---

**Daily Tour Planner**

The **Daily Tour Planner** is a Java-based application designed to streamline travel planning within Pune. It offers a seamless ride-booking experience with features like dynamic location recommendations, real-time cost calculations, customizable waiting options, and detailed billing. The application combines a user-friendly GUI with backend data handling for an interactive and personalized travel experience.

---

**Features**

1. **Dynamic Ride Planning**:
   - Users can select their current location and destination from predefined lists.
   - Offers additional destinations based on user preferences (e.g., cafes, restaurants, tourist spots).

2. **Cost Calculation**:
   - Calculates travel costs dynamically based on distance and the selected mode of transport.
   - Incorporates waiting charges into the final bill.

3. **Interactive GUI**:
   - Built with Java Swing for a visually appealing and user-friendly experience.
   - Multiple frames guide users step-by-step through the ride-planning process.

4. **Comprehensive Billing**:
   - Generates a detailed bill summarizing the journey, including pickup/dropoff points, distances traveled, and waiting charges.

5. **User Feedback**:
   - Includes a rating slider to collect user feedback at the end of the journey.

---

**Modules Overview**

**1. Ride Flow**
- Users start by selecting their current location (`Myframe1`) and destination (`myframe2`).
- After reaching the initial destination, users can:
  - **Continue** the ride (`myframe5_c2`) with new recommendations.
  - **Wait** and add waiting charges (`myfram5_w`).
  - **Stop** and finalize the ride (`myframe5_b`).

**2. Transportation Module**
- Users choose a mode of transport:
  - **2-Wheeler**: ₹15 for the first km, ₹12 per km thereafter.
  - **3-Wheeler**: ₹25 for the first km, ₹17 per km thereafter.
  - **4-Wheeler**: ₹35 for the first km, ₹20 per km thereafter.
- Dynamic cost calculation based on distance.

**3. Recommendations**
- Dynamically fetches recommended destinations based on:
  - Current location.
  - User preferences (e.g., cafes, restaurants, tourist hubs).
- Integrated with a MySQL database for real-time data retrieval.

**4. Billing and Feedback**
- Displays a comprehensive bill, including:
  - Pickup/dropoff locations.
  - Travel distances.
  - Waiting charges.
  - Total cost.
- Collects user feedback via a rating slider.

---

**How It Works**

**Step 1: Start Your Ride**
- Select your current location from a list of predefined options.

**Step 2: Choose a Destination**
- Pick a destination from popular locations in Pune.

**Step 3: Ride Options**
- **Continue the Ride**:
  - Explore nearby cafes, restaurants, or tourist spots.
- **Wait**:
  - Pause your ride and add waiting charges.
- **Stop the Ride**:
  - View the final bill and provide feedback.

**Step 4: View the Bill**
- Get a detailed summary of your journey.
- Include optional waiting charges and transport costs.

---

**Technologies Used**

1. **Programming Language**: Java
2. **GUI Framework**: Java Swing
3. **Database**: MySQL
4. **Backend Logic**:
   - Object-Oriented Programming (OOP) principles.
   - Classes like `transport`, `Ride_continuation`, and `GEG` for modular functionality.
5. **Integration**:
   - JDBC for database connectivity.

---

**Database Schema**

**Table: `route_data`**
Stores information about available routes.

| **Column**            | **Type**    | **Description**                              |
|------------------------|-------------|----------------------------------------------|
| `current_loc`          | `VARCHAR`  | Current location of the user.                |
| `destination`          | `VARCHAR`  | Potential next destination.                  |
| `Type_Of_Destination`  | `CHAR(1)`  | Type of destination (`F`: Food, `T`: Tourism)|

---

**Key Classes**

**1. `transport`**
- Handles transport cost calculations based on mode and distance.

**2. `Ride_continuation`**
- Dynamically fetches recommended destinations from the database.

#### **3. `Myframe1` to `myframe5_b`**
- Implements the GUI for location selection, ride options, billing, and feedback.

---

### **Example Workflow**

1. **Start Your Journey**:
   - Current location: `Kothrud`.
   - Selected transport: `4-Wheeler`.

2. **Choose a Destination**:
   - Destination: `Pashan`.
   - Distance: `7 km`.

3. **Continue Your Ride**:
   - Recommendations: `Cafe Mocha`, `Bistro 57`, `Starbucks`.

4. **Add Waiting Time**:
   - Waiting: `10 minutes`.

5. **Stop and Finalize**:
   - View the bill:
     - Travel cost: ₹140.
     - Waiting charges: ₹10.
     - **Total**: ₹150.
---

**Contributors**

- **Siddhi Vaidya** - Developer
- **Shreya Gujarathi** - Developer
- **Shruti Thakur** - Developer
- **Sanika Shidore** - Developer

---

### **License**

This project is licensed under the [MIT License](LICENSE).

---

Let me know if you need additional customizations! 🚀
