Feature: Tentukan apakah email memiliki format yang valid atau tidak.

    Scenario: Valid email
    Given saya memasukkan email "esturenatalia@gmail.com"
    When saya test formatnya
    Then hasilnya harus "true"

    Scenario: Invalid email
        Given saya memasukkan email "estuaja"
        When saya test formatnya
        Then hasilnya harus "false"