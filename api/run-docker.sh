docker build --pull --no-cache -t api:latest .
docker run -p 8080:8080 -t api:latest
