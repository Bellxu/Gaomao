package com.qwet.gaomao.Bean;

import java.util.List;

/**
 * Created by xu on 2018/8/13.
 */

public class sampleBean {

    private List<DetailListBean> detailList;
    private List<ListBean> list;

    public List<DetailListBean> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DetailListBean> detailList) {
        this.detailList = detailList;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class DetailListBean {
        /**
         * PMTaskOrderID : 1
         * detail : {"ActEndTime":"/Date(1532051739000)/","ActStartTime":"/Date(1531058991000)/","ConfirmDes":"","ConfirmTime":"/Date(1532051739000)/","ConfirmUserName":"李智武","EqpName":"排水设备_1","EqpTypeName":"XXX","EquipmentID":0,"InvalidUserName":"李智武","IsDeadLine":1,"IsDownload":0,"IsInvalid":0,"LmTime":"/Date(1532051739000)/","LmUserName":"李智武","PMTaskOrderID":1,"PartionName":"PDGK001","Status":"未完成","StatusID":"Starting","TaskEndTime":"/Date(1529424000000)/","TaskStartTime":"/Date(1529164800000)/","TemplateID":0,"ToUserID":"twg","ToUserName":"童伟光","TunnelID":56,"TunnelName":"浦东高科园地下综合管廊"}
         * inputPic : []
         * maintenanceItemHead : []
         * maintenanceItemValue : [[]]
         * pic : []
         */

        private int PMTaskOrderID;
        private DetailBean detail;
        private List<?> inputPic;
        private List<?> maintenanceItemHead;
        private List<List<?>> maintenanceItemValue;
        private List<?> pic;

        public int getPMTaskOrderID() {
            return PMTaskOrderID;
        }

        public void setPMTaskOrderID(int PMTaskOrderID) {
            this.PMTaskOrderID = PMTaskOrderID;
        }

        public DetailBean getDetail() {
            return detail;
        }

        public void setDetail(DetailBean detail) {
            this.detail = detail;
        }

        public List<?> getInputPic() {
            return inputPic;
        }

        public void setInputPic(List<?> inputPic) {
            this.inputPic = inputPic;
        }

        public List<?> getMaintenanceItemHead() {
            return maintenanceItemHead;
        }

        public void setMaintenanceItemHead(List<?> maintenanceItemHead) {
            this.maintenanceItemHead = maintenanceItemHead;
        }

        public List<List<?>> getMaintenanceItemValue() {
            return maintenanceItemValue;
        }

        public void setMaintenanceItemValue(List<List<?>> maintenanceItemValue) {
            this.maintenanceItemValue = maintenanceItemValue;
        }

        public List<?> getPic() {
            return pic;
        }

        public void setPic(List<?> pic) {
            this.pic = pic;
        }

        public static class DetailBean {
            /**
             * ActEndTime : /Date(1532051739000)/
             * ActStartTime : /Date(1531058991000)/
             * ConfirmDes :
             * ConfirmTime : /Date(1532051739000)/
             * ConfirmUserName : 李智武
             * EqpName : 排水设备_1
             * EqpTypeName : XXX
             * EquipmentID : 0
             * InvalidUserName : 李智武
             * IsDeadLine : 1
             * IsDownload : 0
             * IsInvalid : 0
             * LmTime : /Date(1532051739000)/
             * LmUserName : 李智武
             * PMTaskOrderID : 1
             * PartionName : PDGK001
             * Status : 未完成
             * StatusID : Starting
             * TaskEndTime : /Date(1529424000000)/
             * TaskStartTime : /Date(1529164800000)/
             * TemplateID : 0
             * ToUserID : twg
             * ToUserName : 童伟光
             * TunnelID : 56
             * TunnelName : 浦东高科园地下综合管廊
             */

            private String ActEndTime;
            private String ActStartTime;
            private String ConfirmDes;
            private String ConfirmTime;
            private String ConfirmUserName;
            private String EqpName;
            private String EqpTypeName;
            private int EquipmentID;
            private String InvalidUserName;
            private int IsDeadLine;
            private int IsDownload;
            private int IsInvalid;
            private String LmTime;
            private String LmUserName;
            private int PMTaskOrderID;
            private String PartionName;
            private String Status;
            private String StatusID;
            private String TaskEndTime;
            private String TaskStartTime;
            private int TemplateID;
            private String ToUserID;
            private String ToUserName;
            private int TunnelID;
            private String TunnelName;

            public String getActEndTime() {
                return ActEndTime;
            }

            public void setActEndTime(String ActEndTime) {
                this.ActEndTime = ActEndTime;
            }

            public String getActStartTime() {
                return ActStartTime;
            }

            public void setActStartTime(String ActStartTime) {
                this.ActStartTime = ActStartTime;
            }

            public String getConfirmDes() {
                return ConfirmDes;
            }

            public void setConfirmDes(String ConfirmDes) {
                this.ConfirmDes = ConfirmDes;
            }

            public String getConfirmTime() {
                return ConfirmTime;
            }

            public void setConfirmTime(String ConfirmTime) {
                this.ConfirmTime = ConfirmTime;
            }

            public String getConfirmUserName() {
                return ConfirmUserName;
            }

            public void setConfirmUserName(String ConfirmUserName) {
                this.ConfirmUserName = ConfirmUserName;
            }

            public String getEqpName() {
                return EqpName;
            }

            public void setEqpName(String EqpName) {
                this.EqpName = EqpName;
            }

            public String getEqpTypeName() {
                return EqpTypeName;
            }

            public void setEqpTypeName(String EqpTypeName) {
                this.EqpTypeName = EqpTypeName;
            }

            public int getEquipmentID() {
                return EquipmentID;
            }

            public void setEquipmentID(int EquipmentID) {
                this.EquipmentID = EquipmentID;
            }

            public String getInvalidUserName() {
                return InvalidUserName;
            }

            public void setInvalidUserName(String InvalidUserName) {
                this.InvalidUserName = InvalidUserName;
            }

            public int getIsDeadLine() {
                return IsDeadLine;
            }

            public void setIsDeadLine(int IsDeadLine) {
                this.IsDeadLine = IsDeadLine;
            }

            public int getIsDownload() {
                return IsDownload;
            }

            public void setIsDownload(int IsDownload) {
                this.IsDownload = IsDownload;
            }

            public int getIsInvalid() {
                return IsInvalid;
            }

            public void setIsInvalid(int IsInvalid) {
                this.IsInvalid = IsInvalid;
            }

            public String getLmTime() {
                return LmTime;
            }

            public void setLmTime(String LmTime) {
                this.LmTime = LmTime;
            }

            public String getLmUserName() {
                return LmUserName;
            }

            public void setLmUserName(String LmUserName) {
                this.LmUserName = LmUserName;
            }

            public int getPMTaskOrderID() {
                return PMTaskOrderID;
            }

            public void setPMTaskOrderID(int PMTaskOrderID) {
                this.PMTaskOrderID = PMTaskOrderID;
            }

            public String getPartionName() {
                return PartionName;
            }

            public void setPartionName(String PartionName) {
                this.PartionName = PartionName;
            }

            public String getStatus() {
                return Status;
            }

            public void setStatus(String Status) {
                this.Status = Status;
            }

            public String getStatusID() {
                return StatusID;
            }

            public void setStatusID(String StatusID) {
                this.StatusID = StatusID;
            }

            public String getTaskEndTime() {
                return TaskEndTime;
            }

            public void setTaskEndTime(String TaskEndTime) {
                this.TaskEndTime = TaskEndTime;
            }

            public String getTaskStartTime() {
                return TaskStartTime;
            }

            public void setTaskStartTime(String TaskStartTime) {
                this.TaskStartTime = TaskStartTime;
            }

            public int getTemplateID() {
                return TemplateID;
            }

            public void setTemplateID(int TemplateID) {
                this.TemplateID = TemplateID;
            }

            public String getToUserID() {
                return ToUserID;
            }

            public void setToUserID(String ToUserID) {
                this.ToUserID = ToUserID;
            }

            public String getToUserName() {
                return ToUserName;
            }

            public void setToUserName(String ToUserName) {
                this.ToUserName = ToUserName;
            }

            public int getTunnelID() {
                return TunnelID;
            }

            public void setTunnelID(int TunnelID) {
                this.TunnelID = TunnelID;
            }

            public String getTunnelName() {
                return TunnelName;
            }

            public void setTunnelName(String TunnelName) {
                this.TunnelName = TunnelName;
            }
        }
    }

    public static class ListBean {
        /**
         * ActEndTime : /Date(1532051739000)/
         * ActStartTime : /Date(1531058991000)/
         * ConfirmUserName : 李智武
         * EqpName : 排水设备_1
         * EqpTypeName : XXX
         * EquipmentID : 0
         * IsDeadLine : 1
         * IsDownload : 0
         * IsInvalid : 0
         * LmTime : /Date(1532051739000)/
         * LmUserName : 李智武
         * PMTaskOrderID : 1
         * PartionName : PDGK001
         * Status : 未完成
         * StatusID : Starting
         * TaskEndTime : /Date(1529424000000)/
         * TaskStartTime : /Date(1529164800000)/
         * TemplateID : 0
         * ToUserID : twg
         * ToUserName : 童伟光
         * TunnelID : 0
         * TunnelName : 浦东高科园地下综合管廊
         * TaskDescription : 童伟光第一次测试上传图片生成任务单
         * MAID : 1
         */

        private String ActEndTime;
        private String ActStartTime;
        private String ConfirmUserName;
        private String EqpName;
        private String EqpTypeName;
        private int EquipmentID;
        private int IsDeadLine;
        private int IsDownload;
        private int IsInvalid;
        private String LmTime;
        private String LmUserName;
        private int PMTaskOrderID;
        private String PartionName;
        private String Status;
        private String StatusID;
        private String TaskEndTime;
        private String TaskStartTime;
        private int TemplateID;
        private String ToUserID;
        private String ToUserName;
        private int TunnelID;
        private String TunnelName;
        private String TaskDescription;
        private int MAID;

        public String getActEndTime() {
            return ActEndTime;
        }

        public void setActEndTime(String ActEndTime) {
            this.ActEndTime = ActEndTime;
        }

        public String getActStartTime() {
            return ActStartTime;
        }

        public void setActStartTime(String ActStartTime) {
            this.ActStartTime = ActStartTime;
        }

        public String getConfirmUserName() {
            return ConfirmUserName;
        }

        public void setConfirmUserName(String ConfirmUserName) {
            this.ConfirmUserName = ConfirmUserName;
        }

        public String getEqpName() {
            return EqpName;
        }

        public void setEqpName(String EqpName) {
            this.EqpName = EqpName;
        }

        public String getEqpTypeName() {
            return EqpTypeName;
        }

        public void setEqpTypeName(String EqpTypeName) {
            this.EqpTypeName = EqpTypeName;
        }

        public int getEquipmentID() {
            return EquipmentID;
        }

        public void setEquipmentID(int EquipmentID) {
            this.EquipmentID = EquipmentID;
        }

        public int getIsDeadLine() {
            return IsDeadLine;
        }

        public void setIsDeadLine(int IsDeadLine) {
            this.IsDeadLine = IsDeadLine;
        }

        public int getIsDownload() {
            return IsDownload;
        }

        public void setIsDownload(int IsDownload) {
            this.IsDownload = IsDownload;
        }

        public int getIsInvalid() {
            return IsInvalid;
        }

        public void setIsInvalid(int IsInvalid) {
            this.IsInvalid = IsInvalid;
        }

        public String getLmTime() {
            return LmTime;
        }

        public void setLmTime(String LmTime) {
            this.LmTime = LmTime;
        }

        public String getLmUserName() {
            return LmUserName;
        }

        public void setLmUserName(String LmUserName) {
            this.LmUserName = LmUserName;
        }

        public int getPMTaskOrderID() {
            return PMTaskOrderID;
        }

        public void setPMTaskOrderID(int PMTaskOrderID) {
            this.PMTaskOrderID = PMTaskOrderID;
        }

        public String getPartionName() {
            return PartionName;
        }

        public void setPartionName(String PartionName) {
            this.PartionName = PartionName;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public String getStatusID() {
            return StatusID;
        }

        public void setStatusID(String StatusID) {
            this.StatusID = StatusID;
        }

        public String getTaskEndTime() {
            return TaskEndTime;
        }

        public void setTaskEndTime(String TaskEndTime) {
            this.TaskEndTime = TaskEndTime;
        }

        public String getTaskStartTime() {
            return TaskStartTime;
        }

        public void setTaskStartTime(String TaskStartTime) {
            this.TaskStartTime = TaskStartTime;
        }

        public int getTemplateID() {
            return TemplateID;
        }

        public void setTemplateID(int TemplateID) {
            this.TemplateID = TemplateID;
        }

        public String getToUserID() {
            return ToUserID;
        }

        public void setToUserID(String ToUserID) {
            this.ToUserID = ToUserID;
        }

        public String getToUserName() {
            return ToUserName;
        }

        public void setToUserName(String ToUserName) {
            this.ToUserName = ToUserName;
        }

        public int getTunnelID() {
            return TunnelID;
        }

        public void setTunnelID(int TunnelID) {
            this.TunnelID = TunnelID;
        }

        public String getTunnelName() {
            return TunnelName;
        }

        public void setTunnelName(String TunnelName) {
            this.TunnelName = TunnelName;
        }

        public String getTaskDescription() {
            return TaskDescription;
        }

        public void setTaskDescription(String TaskDescription) {
            this.TaskDescription = TaskDescription;
        }

        public int getMAID() {
            return MAID;
        }

        public void setMAID(int MAID) {
            this.MAID = MAID;
        }
    }
}
