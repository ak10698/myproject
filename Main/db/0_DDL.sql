
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `gg_demo_db`
--
CREATE DATABASE IF NOT EXISTS `gg_demo_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gg_demo_db`;

-- --------------------------------------------------------

--
-- Table structure for table `gg_translation_config`
--

DROP TABLE IF EXISTS `gg_translation_config`;
CREATE TABLE `gg_translation_config` (
  `id` int(11) NOT NULL,
  `module` varchar(50) NOT NULL,
  `gg_key` varchar(50) NOT NULL,
  `gg_value` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gg_translation_config`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `gg_translation_config`
--
ALTER TABLE `gg_translation_config`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `module_key` (`module`, `gg_key` );

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gg_translation_config`
--
ALTER TABLE `gg_translation_config`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;