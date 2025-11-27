# Utilisez l'image de base de Python
FROM python:3.9-slim

# Créez et définissez le répertoire de travail
WORKDIR /app

# Copiez les fichiers locaux dans le conteneur
COPY . /app

# Installez Flask
RUN pip install Flask

# Exposez le port de l'application Flask
EXPOSE 5000

# Commande pour démarrer l'application
CMD ["python", "app.py"]
