package org.jetlinks.community.device.spi;

import org.jetlinks.core.metadata.ConfigMetadata;
import reactor.core.publisher.Flux;

/**
 * 设备配置定义提供者,通常用于第三方平台接入时,告诉系统对应的产品或者设备所需要的配置，如：第三方平台需要的密钥等信息
 * 系统在导入设备或者编辑设备时，会根据配置定义进行不同的操作，如选择前端界面，生成导出模版等
 *
 * @author zhouhao
 * @see org.jetlinks.community.device.service.DeviceConfigMetadataManager
 * @since 1.7.0
 */
public interface DeviceConfigMetadataSupplier {

    /**
     * @see org.jetlinks.community.device.service.DeviceConfigMetadataManager#getDeviceConfigMetadata(String)
     */
    Flux<ConfigMetadata> getDeviceConfigMetadata(String deviceId);

    /**
     * @see org.jetlinks.community.device.service.DeviceConfigMetadataManager#getDeviceConfigMetadataByProductId(String)
     */
    Flux<ConfigMetadata> getDeviceConfigMetadataByProductId(String productId);

    /**
     * @see org.jetlinks.community.device.service.DeviceConfigMetadataManager#getProductConfigMetadata(String)
     */
    Flux<ConfigMetadata> getProductConfigMetadata(String productId);

}
