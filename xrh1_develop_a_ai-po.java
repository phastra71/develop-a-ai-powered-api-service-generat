public class AIPoweredAPIServiceGenerator {
    private String serviceName;
    private String serviceDescription;
    private List<Entity> entities;
    private List<APIEndpoint> apiEndpoints;
    private AIDataModel aiDataModel;

    public AIPoweredAPIServiceGenerator(String serviceName, String serviceDescription) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.entities = new ArrayList<>();
        this.apiEndpoints = new ArrayList<>();
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public void addAPIEndpoint(APIEndpoint apiEndpoint) {
        this.apiEndpoints.add(apiEndpoint);
    }

    public void setAIDataModel(AIDataModel aiDataModel) {
        this.aiDataModel = aiDataModel;
    }

    public APIGeneratedResponse generateAPI() {
        APIGeneratedResponse response = new APIGeneratedResponse();
        response.setServiceName(this.serviceName);
        response.setServiceDescription(this.serviceDescription);
        response.setEntities(this.entities);
        response.setApiEndpoints(this.apiEndpoints);
        response.setAiDataModel(this.aiDataModel);
        return response;
    }

    public static class Entity {
        private String name;
        private String description;
        private List<Field> fields;

        public Entity(String name, String description) {
            this.name = name;
            this.description = description;
            this.fields = new ArrayList<>();
        }

        public void addField(Field field) {
            this.fields.add(field);
        }
    }

    public static class Field {
        private String name;
        private String type;

        public Field(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    public static class APIEndpoint {
        private String method;
        private String path;
        private String description;

        public APIEndpoint(String method, String path, String description) {
            this.method = method;
            this.path = path;
            this.description = description;
        }
    }

    public static class AIDataModel {
        private String algorithm;
        private String modelDescription;

        public AIDataModel(String algorithm, String modelDescription) {
            this.algorithm = algorithm;
            this.modelDescription = modelDescription;
        }
    }

    public static class APIGeneratedResponse {
        private String serviceName;
        private String serviceDescription;
        private List<Entity> entities;
        private List<APIEndpoint> apiEndpoints;
        private AIDataModel aiDataModel;

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public String getServiceDescription() {
            return serviceDescription;
        }

        public void setServiceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
        }

        public List<Entity> getEntities() {
            return entities;
        }

        public void setEntities(List<Entity> entities) {
            this.entities = entities;
        }

        public List<APIEndpoint> getApiEndpoints() {
            return apiEndpoints;
        }

        public void setApiEndpoints(List<APIEndpoint> apiEndpoints) {
            this.apiEndpoints = apiEndpoints;
        }

        public AIDataModel getAiDataModel() {
            return aiDataModel;
        }

        public void setAiDataModel(AIDataModel aiDataModel) {
            this.aiDataModel = aiDataModel;
        }
    }
}