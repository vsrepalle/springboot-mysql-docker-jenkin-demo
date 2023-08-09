Multi-Database Docker Compose Example
This repository contains an example application demonstrating how to use Docker Compose to run a multi-database setup. The application is designed to work with MySQL, PostgreSQL, and SQL Server databases simultaneously using separate Docker Compose files for each database.

Prerequisites
Docker must be installed on your system.
Getting Started
Clone this repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/multi-database-docker.git
cd multi-database-docker
Choose the database service you want to run and navigate to the corresponding Compose file:

MySQL: docker-compose-mysql.yml
PostgreSQL: docker-compose-postgres.yml
SQL Server: docker-compose-sqlserver.yml
Use Docker Compose to start the chosen database service:

bash
Copy code
docker-compose -f docker-compose-mysql.yml up
Replace docker-compose-mysql.yml with the relevant Compose file.

Access the application at http://localhost:9090 (adjust the port as needed).

When you're done, stop and remove the containers, networks, and volumes:

bash
Copy code
docker-compose -f docker-compose-mysql.yml down
Configuration
Each Compose file (docker-compose-mysql.yml, docker-compose-postgres.yml, docker-compose-sqlserver.yml) contains configurations for the respective database service. Adjust these configurations to match your requirements.

License
This example is licensed under the MIT License.

Acknowledgements
This example is inspired by common use cases of managing multiple databases with Docker Compose.
Feedback and Contributions
Feedback and contributions are welcome! If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request.

