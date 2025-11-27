"""
NOM : Decaho Gbegbe
Numero d'etudiant : 300094197
Cours : CSI4139 - Automne 2024
...
Code Lab 1 - hashCode.py
Ce code permet de simuler des attaques de force brute
sur la propriété de non-inversibilité et de résistance
aux collisions en utilisant le hachage SHA-1.

"""
import hashlib
import random

# Fonction pour tronquer un hash à 24 bits (3 octets)
def truncate_to_24_bits(hash_bytes):
    # On prend les 3 premiers octets (24 bits) du hash
    return hash_bytes[:3]

# Générer un hachage SHA-1 et tronquer à 24 bits
def generate_hash_24_bits(message):
    hash_obj = hashlib.sha1(message.encode('utf-8'))  # Utilisation de SHA-1
    return truncate_to_24_bits(hash_obj.digest())  # Tronquer à 24 bits

# 1. Simuler l'attaque par force brute sur la propriété de non-inversibilité
def brute_force_one_way_property(target_hash):
    trials = 0
    while True:
        trials += 1
        random_message = str(random.randint(0, 2**24))  # Générer une entrée aléatoire
        if generate_hash_24_bits(random_message) == target_hash:
            return trials  # Retourner le nombre d'essais nécessaires

# 2. Simuler l'attaque par force brute sur la propriété de résistance aux collisions
def brute_force_collision_free_property():
    hash_dict = {}
    trials = 0
    while True:
        trials += 1
        random_message = str(random.randint(0, 2**24))  # Générer une entrée aléatoire
        hash_value = generate_hash_24_bits(random_message)

        if hash_value in hash_dict:
            return trials  # Collision trouvée
        else:
            hash_dict[hash_value] = random_message

# 3. Expérience pour casser les deux propriétés
def run_experiments(num_trials):
    one_way_trials_list = []
    collision_free_trials_list = []

    for i in range(num_trials):
        # Cibler un hash aléatoire pour l'attaque one-way
        target_message = str(random.randint(0, 2**24))
        target_hash = generate_hash_24_bits(target_message)

        # Casser la propriété de non-inversibilité (one-way)
        one_way_trials = brute_force_one_way_property(target_hash)
        one_way_trials_list.append(one_way_trials)

        # Casser la propriété de résistance aux collisions (collision-free)
        collision_free_trials = brute_force_collision_free_property()
        collision_free_trials_list.append(collision_free_trials)

    avg_one_way_trials = sum(one_way_trials_list) / num_trials
    avg_collision_free_trials = sum(collision_free_trials_list) / num_trials

    return avg_one_way_trials, avg_collision_free_trials

# Lancer l'expérience
if __name__ == "__main__":
    num_trials = 10  # Nombre de répétitions de l'expérience
    avg_one_way, avg_collision_free = run_experiments(num_trials)

    print(f"Moyenne des essais pour casser la propriété de non-inversibilité : {avg_one_way}")
    print(f"Moyenne des essais pour casser la propriété de résistance aux collisions : {avg_collision_free}")
