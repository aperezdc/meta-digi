# Digi Embedded Yocto (DEY) 2.2
## Release 2.2-r3

This document provides information about Digi Embedded Yocto,
Digi International's professional embedded Yocto development environment.

Digi Embedded Yocto 2.2 is based on the Yocto Project(TM) 2.2 (Morty) release.

For a full list of supported features and interfaces please refer to the
online documentation.

# Tested OS versions

The current release has been verified and tested with the following
OS versions:

* Ubuntu 16.04
* Ubuntu 14.04

# Supported Platforms

Software for the following hardware platforms is in production support:

## ConnectCore 6UL
* ConnectCore 6UL System-on-Module (SOM)
  * [CC-WMX-JN58-NE](https://www.digi.com/products/models/cc-wmx-jn58-ne)
  * [CC-MX-JN58-Z1](https://www.digi.com/products/models/cc-mx-jn58-z1)
  * CC-WMX-JN7A-NE
* ConnectCore 6UL SBC Express
  * [CC-WMX6UL-START](https://www.digi.com/products/models/cc-wmx6ul-start) ([Get Started](https://www.digi.com/resources/documentation/digidocs/90001548/default.htm#concept/yocto/c_get_started_with_yocto.htm))
  * [CC-SBE-WMX-JN58](https://www.digi.com/products/models/cc-sbe-wmx-jn58)
* ConnectCore 6UL SBC Pro
  * [CC-WMX6UL-KIT](https://www.digi.com/products/models/cc-wmx6ul-kit) ([Get Started](https://www.digi.com/resources/documentation/digidocs/90001547/default.htm#concept/yocto/c_get_started_with_yocto.htm))
  * [CC-SBP-WMX-JN58](https://www.digi.com/products/models/cc-sbp-wmx-jn58)

## ConnectCore 6
* ConnectCore 6 System-on-Module (SOM)
  * [CC-WMX-J97C-TN](https://www.digi.com/products/models/cc-wmx-j97c-tn)
  * [CC-WMX-L96C-TE](https://www.digi.com/products/models/cc-wmx-l96c-te)
  * [CC-WMX-L87C-TE](https://www.digi.com/products/models/cc-wmx-l87c-te)
  * [CC-MX-L76C-Z1](https://www.digi.com/products/models/cc-mx-l76c-z1)
  * [CC-MX-L86C-Z1](https://www.digi.com/products/models/cc-mx-l86c-z1)
  * [CC-MX-L96C-Z1](https://www.digi.com/products/models/cc-mx-l96c-z1)
  * [CC-WMX-L76C-TE](https://www.digi.com/products/models/cc-wmx-l76c-te)
  * CC-WMX-K87C-FJA
  * CC-WMX-K77C-TE
  * CC-WMX-L97D-TN
  * CC-WMX-J98C-FJA
  * CC-WMX-J98C-FJA-1
* ConnectCore 6 SBC
  * [CC-WMX6-KIT](https://www.digi.com/products/models/cc-wmx6-kit) ([Get Started](https://www.digi.com/resources/documentation/digidocs/90001546/default.htm#concept/yocto/c_get_started_with_yocto.htm))
  * [CC-SB-WMX-J97C-1](https://www.digi.com/products/models/cc-sb-wmx-j97c-1)
  * [CC-SB-WMX-L87C-1](https://www.digi.com/products/models/cc-sb-wmx-l87c-1)
  * [CC-SB-WMX-L76C-1](https://www.digi.com/products/models/cc-sb-wmx-l76c-1)

## ConnectCore 6 Plus
* ConnectCore 6 Plus System-on-Module (SOM)
  * CC-WMX-KK8D-TN
* ConnectCore 6 Plus SBC
  * CC-SB-WMX-KK8D

Previous versions of Digi Embedded Yocto include support for additional Digi
hardware.

# Installation

Digi Embedded Yocto is composed of a set of different Yocto layers that work in
parallel. The layers are specified on a [manifest](https://github.com/digi-embedded/dey-manifest/blob/morty/default.xml) file.

To install, please follow the instructions at the dey-manifest [README](https://github.com/digi-embedded/dey-manifest)

# Documentation

Documentation is available online on the Digi documentation site:

* [ConnectCore 6UL SBC Express](https://www.digi.com/resources/documentation/digidocs/90001548/default.htm)
* [ConnectCore 6UL SBC Pro](https://www.digi.com/resources/documentation/digidocs/90001547/default.htm)
* [ConnectCore 6 SBC](https://www.digi.com/resources/documentation/digidocs/90001546/default.htm)
* [ConnectCore 6 Plus SBC](https://www.digi.com/resources/documentation/digidocs/90002275/default.htm)

# Downloads

* Demo images: https://ftp1.digi.com/support/digiembeddedyocto/2.2/r3/images/
* Software Development Kit (SDK): https://ftp1.digi.com/support/digiembeddedyocto/2.2/r3/sdk/

# Release Changelog

## 2.2-r3

* Added support for ConnectCore 6 Plus platform
* Updated kernel version to v4.9 for ConnectCore 6UL platform
* Added Digi APIX C library to access and manage ConnectCore platforms interfaces:
  * ADC
  * GPIO
  * I2C
  * PWM
  * SPI
* Updated AWS Greengrass Core software to v1.1.0
* Updated TrustFence Code Signing Tool to v2.3.3
* Default rootfs images are now Eclipse debug ready
* Updated documentation

## 2.2-r2

* Fix for KRACK Attack vulnerability:
  * [CVE-2017-13077](https://nvd.nist.gov/vuln/detail/CVE-2017-13077)
  * [CVE-2017-13078](https://nvd.nist.gov/vuln/detail/CVE-2017-13078)
  * [CVE-2017-13079](https://nvd.nist.gov/vuln/detail/CVE-2017-13079)
  * [CVE-2017-13080](https://nvd.nist.gov/vuln/detail/CVE-2017-13080)
  * [CVE-2017-13081](https://nvd.nist.gov/vuln/detail/CVE-2017-13081)
  * [CVE-2017-13082](https://nvd.nist.gov/vuln/detail/CVE-2017-13082)
  * [CVE-2017-13086](https://nvd.nist.gov/vuln/detail/CVE-2017-13086)
  * [CVE-2017-13087](https://nvd.nist.gov/vuln/detail/CVE-2017-13087)
  * [CVE-2017-13088](https://nvd.nist.gov/vuln/detail/CVE-2017-13088)
* Cloud Connector: fix connections through PPP
* Use NetworkManager for ethernet, wireless (station) and cellular network interfaces
* Updated kernel version to v4.1.41 for CC6 platform
* Added support for SPI Slave mode on CC6UL platform
* Added support for Atmel Cryptochip ATEC508A using Cryptoauthlib
* Network failover mechanism
* Raspberry Pi Sense hat Yocto support using meta-digi-maker layer for CC6UL SBC Express
* QT fonts fix
* QT software renderer for CC6UL
* Fix for CVE-2017-1000251 vulnerability (https://nvd.nist.gov/vuln/detail/CVE-2017-1000251)
* RS-485 kernel patches
* Powered by AWS certified on all supported hardware platforms including:
  * AWS GreenGrass core software
  * AWS IoT Device SDK for embedded C
* Updated AR6233 firmware for Radio Equipment Directive module certification
* QCA6564 WorldWide board data file available on request
* Includes MCA firmware v1.0:
  * MCA analog tamper detection
  * MCA ADC-based analog comparators
* Updated U-Boot to version 2015.04-r9
  * Added support for CC6UL variant 0x4
  * Added dynamic environment location and bad block handling for the environment
  * TrustFence:
    * Move RootFS encryption key to 'safe' partition
    * Added support for four tamper interfaces
    * Disable external memory boot in OTP for secure boot
  * Skip initial scanning of bad blocks for faster boot on NAND
  * Updated documentation

## 2.2-r1

* Release based on [Yocto 2.2 (Morty)](https://www.yoctoproject.org/downloads/core/morty22) including:
  * New toolchain based on GCC-6.2.0 and GLIBC-2.24
  * Updated Qt 5.7
  * Updated ModemManager with validated support for:
    * Digi's XBee Cellular LTE Cat 1 (USA/Verizon), with P/N XBC-V1-UT-001
    * Digi's XBee Cellular 3G Global, with P/N XBC-M5-UT-001
    * U-Blox's TOBY L-200/L-210
    * Telit's LE910 and HE910
    * Huawei's ME909u
    * Quectel's EC21 and EC25
  * Modified default networking settings:
    * Defalt to dynamic IP addresses assignments
    * Default station and softAP concurrent wireless mode
  * TrustFence enabled
  * Remote manager
  * Local and remote manager firmware update
  * Package upgrades and security fixes
  * U-boot support for 1GB DDR3 RAM on CC6UL

# Known Issues and Limitations

This is a list of known issues and limitations at the time of release. An
updated list can be found on the online documentation.

* If TrustFence (TM) image encryption support is enabled, the uSD image will
boot a signed U-Boot only.
* Firmware update
  * The software update package must be located in the root level of the
    update media (subfolders are not yet supported).
* Cloud Connector
  * Remote file system management fails with long file names and paths
    (over 255 characters).
* For P2P connections Digi recommends "Negotiated GO" modes. The QCA6564
  devices (ConnectCore 6UL and ConnectCore 6 Plus) running a 4.9 kernel
  version fail to join to autonomous groups.

## ConnectCore 6UL

* ConnectCore 6UL System-on-Module (SOM)
  * The UART connected to the Bluetooth chip on early versions of the ConnectCore
    6UL system-on-module (hardware version < 4) cannot properly execute flow
    control. To work around this issue, UART1 of these SOM versions has been
    configured to operate at 115200 bps and without hardware flow control,
    reducing the maximum throughput of this interface.
  * When using wireless concurrent mode as the wireless interface is shared
    between several different functionalities performance is reduced.
  * When using wireless concurrent mode Digi recommends to keep the different
    modes on the same frequency channels. For example, when configuring access
    point mode on channel 36 on band A, the recommendation would be to connect
    to the same channel both in station mode and WiFi direct so that the radio
    performance is optimized.
  * When working as an access point, DFS capable channels in band A are not
    currently supported.
  * The QCA6564 wireless chip does not support Wake On Wireless LAN.

## ConnectCore 6

* ConnectCore 6 System-on-Module (SOM)
  * NXP i.MX6 processor has a documented errata (ERR004512) whereby the maximum
    performance of the Gigabit FEC is limited to 400Mbps (total for Tx and Rx).
  * When using softAP mode on Band A on the Qualcomm AR6233, channels used for
    Dynamic Frequency Selection (DFS) are not supported.
  * The Qualcomm AR6233 firmware does not support the following configuration
    modes:
    * Concurrent modes involving P2P mode, such as P2P + softAP or P2P + STA.
    * Bluetooth + softAP + STA concurrent mode.
  * A maximum of five clients are supported when using Qualcomm's AR6233 in
    softAP mode.
  * A maximum of ten connected devices are supported when using Qualcomm's AR6233
    Bluetooth Low Energy mode.
* ConnectCore 6 SBC
  * The Micrel PHY KSZ9031 may take between five and six seconds to
    auto-negotiate with Gigabit switches.

## ConnectCore 6 Plus

* ConnectCore 6 Plus System-on-Module (SOM)
  * NXP i.MX6QP processor has a documented errata (ERR004512) whereby the maximum
    performance of the Gigabit FEC is limited to 400Mbps (total for Tx and Rx).
* ConnectCore 6 Plus SBC
  * The Micrel PHY KSZ9031 may take between five and six seconds to
    auto-negotiate with Gigabit switches.

# Support Contact Information

For support questions please contact Digi Technical Support:

* [Enterprise Support](https://mydigi.secure.force.com/customers/)
* [Product Technical Support](https://www.digi.com/support#support-tools)
* [Support forum](https://www.digi.com/support/forum/)

When you contact Digi Technical Support, include important system details and
device information to help Digi resolve the issue more quickly.

1. In the device, run the command 'sysinfo'. This generates the following file:
   /tmp/&lt;current timestamp>.txt.gz.
2. Attach the &lt;current timestamp>.txt.gz file to your support ticket.
