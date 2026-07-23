from docx import Document
doc = Document("data.docx")
text = ""
for para in doc.paragraphs:
    text += para.text.lower()
# Vowel counting
vowels = "aeiou"
vowel_count = 0
for char in text:
    if char in vowels:
        vowel_count += 1
print("Number of vowels:", vowel_count)
# Consonant counting
consonant_count = 0
for char in text:
    if char.isalpha() and char not in vowels:
        consonant_count += 1
print("Number of consonants:", consonant_count)
l = len(text)
print("Total vowels:", vowel_count)
print("Total consonants:", consonant_count)
print("Vowel percentage:", (vowel_count/l)*100)
print("Consonant percentage:", (consonant_count/l)*100)