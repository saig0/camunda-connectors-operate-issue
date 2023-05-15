package org.camunda.community.connectors

import io.zeebe.containers.ZeebeContainer
import org.assertj.core.api.Assertions.assertThatNoException
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Testcontainers
class ApplicationTests {

    private val CAMUNDA_ZEEBE_IMAGE_NAME = "camunda/zeebe:8.2.4"
    private val ZEEBE_DOCKER_IMAGE = DockerImageName.parse(CAMUNDA_ZEEBE_IMAGE_NAME)

    @Container
    var zeebe = ZeebeContainer(ZEEBE_DOCKER_IMAGE)

    @Test
    fun `should start application`() {
        assertThatNoException()
    }

}
