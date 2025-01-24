const { getDefaultConfig, mergeConfig } = require('@react-native/metro-config');

// 기본 설정 가져오기
const defaultConfig = getDefaultConfig(__dirname);

// SVG 파일 처리를 위한 설정 추가
defaultConfig.resolver.assetExts = defaultConfig.resolver.assetExts.filter(ext => ext !== 'svg');
defaultConfig.resolver.sourceExts = [...defaultConfig.resolver.sourceExts, 'svg'];

const config = {
    transformer: {
        babelTransformerPath: require.resolve('react-native-svg-transformer'),
    },
};

module.exports = mergeConfig(defaultConfig, config);
