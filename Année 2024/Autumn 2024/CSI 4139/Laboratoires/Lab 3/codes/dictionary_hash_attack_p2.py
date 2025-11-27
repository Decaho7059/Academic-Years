import crypt
import hashlib
import time  # Import the time module to measure the time taken

# Function to extract the salt from the stored hash
def extract_salt(hashed_password):
    parts = hashed_password.split('$')
    if len(parts) >= 3:
        return f"${parts[1]}${parts[2]}$"
    return None

# Function to hash a word with a given salt (SHA-512)
def hash_word_sha512(word, salt):
    return crypt.crypt(word, salt)

# Function to attempt to crack passwords
def crack_passwords(hashed_file, dictionary_file):
    # Read hashed passwords from file
    with open(hashed_file, 'r') as hashed_pw_file:
        hashed_passwords = [line.strip().split(':') for line in hashed_pw_file]

    # Read dictionary words from file
    with open(dictionary_file, 'r') as dict_file:
        dictionary_words = [line.strip() for line in dict_file]

    # Try to crack each hashed password
    for user, hashed_password in hashed_passwords:
        salt = extract_salt(hashed_password)
        if not salt:
            print(f"Skipping {user} due to invalid hash format.")
            continue

        print(f"Attempting to crack password for {user}...")
        
        start_time = time.time()  # Start timing the cracking attempt

        for word in dictionary_words:
            # Hash the dictionary word with the extracted salt
            hashed_dict_word = hash_word_sha512(word, salt)

            # Compare the hashed dictionary word with the stored password hash
            if hashed_dict_word == hashed_password:
                elapsed_time = time.time() - start_time  # Calculate the time taken
                print(f"[SUCCESS] Password for {user} is '{word}'")
                print(f"Time taken to crack password for {user}: {elapsed_time:.4f} seconds")
                break
        else:
            elapsed_time = time.time() - start_time  # Calculate the time taken even on failure
            print(f"[FAILED] Could not crack password for {user}")
            print(f"Time taken to attempt cracking for {user}: {elapsed_time:.4f} seconds")

if __name__ == "__main__":
    # Specify the path to your hashed password file and dictionary file
    hashed_file = "htpasswd-sha1"
    dictionary_file = "tinylist.txt"

    # Run the password cracking attempt
    crack_passwords(hashed_file, dictionary_file)
