# 🚗 Car Rental System – Java Console Application

A simple, console-based **Car Rental System** written in Java. This project demonstrates the fundamentals of object-oriented programming (OOP) including classes, inheritance, and user interaction through a menu-driven CLI.

> ✅ Packaged in Docker and deployable in Kubernetes

---

## 📋 Features

- Rent and return cars
- Dynamic price calculation based on rental days
- Maintains customer and rental records in memory
- Console-based menu interface
- Docker and Kubernetes deployment ready

---

---

## 🐳 Docker Usage

### ✅ Build Docker Image

```bash
docker build -t car-rental-system:1.0 .
```

✅ Run Docker Container
docker run -it car-rental-system:1.0

### ☸️ Kubernetes Deployment
✅ Step 1: Load Docker Image into Minikube
```bash
minikube image load car-rental-system:1.0
```
✅ Step 2: Apply Deployment
```bash
kubectl apply -f car-rental-deployment.yaml
```
✅ Step 3: Run the App
```bash
kubectl get pods
kubectl exec -it <pod-name> -- bash
java Main
```
