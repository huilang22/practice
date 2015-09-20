

counterList1 = {'ifInOctets':"0",'ifInUcastPkts':"0",'ifInDiscards':"0",'ifInErrors':"0",\
'ifInUnknownProtos':"0",'ifOutOctets':"0",'ifOutUcastPkts':"0", 'ifOutDiscards':"0",'ifOutErrors':"0",\
'ifInMulticastPkts':"0",'ifInBroadcastPkts':"0",'ifOutMulticastPkts':"0",'ifOutBroadcastPkts':"0",\
'ifHCInOctets':"0", 'ifHCInUcastPkts':"0", 'ifHCInMulticastPkts':"0",'ifHCInBroadcastPkts':"0",\
'ifHCOutOctets':"0",'ifHCOutUcastPkts':"0",'ifHCOutMulticastPkts':"0",'ifHCOutBroadcastPkts':"0",\
'cieIfInRuntsErrs':"0",'cieIfInGiantsErrs':"0",'cieIfInFramingErrs':"0" ,'cieIfInOverrunErrs':"0" ,\
'cieIfInIgnored':"0" ,'cieIfInAbortErrs':"0",'cieIfInputQueueDrops':"0" ,'cieIfOutputQueueDrops':"0" ,\
'cieIfResetCount':"0" ,'cieIfCarrierTransitionCount':"0" ,'cieIfInPktRate,cieIfInOctetRate':"0",\
'cieIfOutPktRate':"0",'cieIfOutOctetRate':"0","ifSpeed":"1234","ifHighSpeed":"1234"}
#counterList1 = {"ifSpeed":"123","ifHighSpeed":"1234"}

counterList2 = {"sys_up_time":"string"}

counterLists = [counterList1, counterList2]

tableNameList = ['adcc76_pmb.physicalport', 'adcc76_pmb.system_up_time']
#objectTableName = 'mof.mof_common_objects'

# NSNNetwork-1 should be added , not like Omes DN
DNList1 = ['NSNNetwork-1/CiscoRTR7600-3/PhysicalDevice-1/Chassis-1/Slot-1/Card-SupervisorEngine-1/EquipmentHolder-7/PhysicalPort-GE-1', \
      'NSNNetwork-1/CiscoRTR7600-3/PhysicalDevice-1/Chassis-1/Slot-1/Card-SupervisorEngine-1/EquipmentHolder-8/PhysicalPort-GE-1',\
      'NSNNetwork-1/CiscoRTR7600-3/PhysicalDevice-1/Chassis-1/Slot-1/Card-SupervisorEngine-1/EquipmentHolder-8/PhysicalPort-GE-2',\
      'NSNNetwork-1/CiscoRTR7600-3/PhysicalDevice-1/Chassis-1/Slot-2/Card-Ethernet-1/PhysicalPort-GE-1',\
      'NSNNetwork-1/CiscoRTR7600-3/PhysicalDevice-1/Chassis-1/Slot-2/Card-Ethernet-1/PhysicalPort-GE-101']
DNList2 = []
DNLists = [DNList1,DNList2]