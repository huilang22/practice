/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByServiceCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a BulkOrderRequestByServiceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByServiceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData _______BatchRequest;
  protected ServiceObjectBaseData[] _Service;
  protected Integer ___HierarchyId;
  protected Integer ___InvElementDef;
  protected String ___InvSwapElementFileName;
  protected String ___EquipExternalIdFileName;
  protected Integer ___GlobalPkgParentAccountInternalId;
  protected Integer ___GenerateWorkflow;
  protected BulkUdtTemplateRootRequest ___UDTTemplate;
  protected String ___XMLParticipantFileName;
  protected String ___CDFParticipantFileName;
  protected String ___InvElementFileName;
  protected Integer ___TestParticipantCount;
  protected BulkParticipantQuery ServiceQuery;
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByServiceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData _______BatchRequestIn, ServiceObjectBaseData[] _ServiceIn, Integer ___HierarchyIdIn, Integer ___InvElementDefIn, String ___InvSwapElementFileNameIn, String ___EquipExternalIdFileNameIn, Integer ___GlobalPkgParentAccountInternalIdIn, Integer ___GenerateWorkflowIn, BulkUdtTemplateRootRequest ___UDTTemplateIn, String ___XMLParticipantFileNameIn, String ___CDFParticipantFileNameIn, String ___InvElementFileNameIn, Integer ___TestParticipantCountIn, BulkParticipantQuery ServiceQueryIn) {
    super(id, context, "BulkOrderRequestByServiceCreate");
    _______BatchRequest = _______BatchRequestIn;
    _Service = _ServiceIn;
    ___HierarchyId = ___HierarchyIdIn;
    ___InvElementDef = ___InvElementDefIn;
    ___InvSwapElementFileName = ___InvSwapElementFileNameIn;
    ___EquipExternalIdFileName = ___EquipExternalIdFileNameIn;
    ___GlobalPkgParentAccountInternalId = ___GlobalPkgParentAccountInternalIdIn;
    ___GenerateWorkflow = ___GenerateWorkflowIn;
    ___UDTTemplate = ___UDTTemplateIn;
    ___XMLParticipantFileName = ___XMLParticipantFileNameIn;
    ___CDFParticipantFileName = ___CDFParticipantFileNameIn;
    ___InvElementFileName = ___InvElementFileNameIn;
    ___TestParticipantCount = ___TestParticipantCountIn;
    ServiceQuery = ServiceQueryIn;
  }

  public void translateToMap() {
    if (_______BatchRequest != null) {
      _______BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_______BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (_Service != null) {
      if (_Service != null) {
        Object[] list = new Object[_Service.length];
        for (int i = 0; i < _Service.length; i++) {
          list[i] = ServiceObjectBaseHelper.getMap(_Service[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BulkOrderRequest");
        }
        addInput("ServiceList", list);
      }
    }
    if (___HierarchyId != null) {
      addInput("HierarchyId", ___HierarchyId);
    }
    if (___InvElementDef != null) {
      addInput("InvElementDef", ___InvElementDef);
    }
    if (___InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", ___InvSwapElementFileName);
    }
    if (___EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", ___EquipExternalIdFileName);
    }
    if (___GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", ___GlobalPkgParentAccountInternalId);
    }
    if (___GenerateWorkflow != null) {
      addInput("GenerateWorkflow", ___GenerateWorkflow);
    }
    if (___UDTTemplate != null) {
      addInput("UDTTemplate", ___UDTTemplate);
    }
    if (___XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", ___XMLParticipantFileName);
    }
    if (___CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", ___CDFParticipantFileName);
    }
    if (___InvElementFileName != null) {
      addInput("InvElementFileName", ___InvElementFileName);
    }
    if (___TestParticipantCount != null) {
      addInput("TestParticipantCount", ___TestParticipantCount);
    }
    if (ServiceQuery != null) {
      addInput("ServiceQuery", ServiceQuery);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param _______BatchRequestIn Value of the _______BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _______BatchRequestIn) {
    _______BatchRequest = _______BatchRequestIn;
  }

/**
 *
 * Sets the Service
 * @param _ServiceIn Value of the _Service
 *
 */

  public void setService(ServiceObjectBaseData[] _ServiceIn) {
    _Service = _ServiceIn;
  }

/**
 *
 * Sets the HierarchyId
 * @param ___HierarchyIdIn Value of the ___HierarchyId
 *
 */

  public void setHierarchyId(Integer ___HierarchyIdIn) {
    ___HierarchyId = ___HierarchyIdIn;
  }

/**
 *
 * Sets the InvElementDef
 * @param ___InvElementDefIn Value of the ___InvElementDef
 *
 */

  public void setInvElementDef(Integer ___InvElementDefIn) {
    ___InvElementDef = ___InvElementDefIn;
  }

/**
 *
 * Sets the InvSwapElementFileName
 * @param ___InvSwapElementFileNameIn Value of the ___InvSwapElementFileName
 *
 */

  public void setInvSwapElementFileName(String ___InvSwapElementFileNameIn) {
    ___InvSwapElementFileName = ___InvSwapElementFileNameIn;
  }

/**
 *
 * Sets the EquipExternalIdFileName
 * @param ___EquipExternalIdFileNameIn Value of the ___EquipExternalIdFileName
 *
 */

  public void setEquipExternalIdFileName(String ___EquipExternalIdFileNameIn) {
    ___EquipExternalIdFileName = ___EquipExternalIdFileNameIn;
  }

/**
 *
 * Sets the GlobalPkgParentAccountInternalId
 * @param ___GlobalPkgParentAccountInternalIdIn Value of the ___GlobalPkgParentAccountInternalId
 *
 */

  public void setGlobalPkgParentAccountInternalId(Integer ___GlobalPkgParentAccountInternalIdIn) {
    ___GlobalPkgParentAccountInternalId = ___GlobalPkgParentAccountInternalIdIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param ___GenerateWorkflowIn Value of the ___GenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Integer ___GenerateWorkflowIn) {
    ___GenerateWorkflow = ___GenerateWorkflowIn;
  }

/**
 *
 * Sets the UDTTemplate
 * @param ___UDTTemplateIn Value of the ___UDTTemplate
 *
 */

  public void setUDTTemplate(BulkUdtTemplateRootRequest ___UDTTemplateIn) {
    ___UDTTemplate = ___UDTTemplateIn;
  }

/**
 *
 * Sets the XMLParticipantFileName
 * @param ___XMLParticipantFileNameIn Value of the ___XMLParticipantFileName
 *
 */

  public void setXMLParticipantFileName(String ___XMLParticipantFileNameIn) {
    ___XMLParticipantFileName = ___XMLParticipantFileNameIn;
  }

/**
 *
 * Sets the CDFParticipantFileName
 * @param ___CDFParticipantFileNameIn Value of the ___CDFParticipantFileName
 *
 */

  public void setCDFParticipantFileName(String ___CDFParticipantFileNameIn) {
    ___CDFParticipantFileName = ___CDFParticipantFileNameIn;
  }

/**
 *
 * Sets the InvElementFileName
 * @param ___InvElementFileNameIn Value of the ___InvElementFileName
 *
 */

  public void setInvElementFileName(String ___InvElementFileNameIn) {
    ___InvElementFileName = ___InvElementFileNameIn;
  }

/**
 *
 * Sets the TestParticipantCount
 * @param ___TestParticipantCountIn Value of the ___TestParticipantCount
 *
 */

  public void setTestParticipantCount(Integer ___TestParticipantCountIn) {
    ___TestParticipantCount = ___TestParticipantCountIn;
  }

/**
 *
 * Sets the ServiceQuery
 * @param ServiceQueryIn Value of the ServiceQuery
 *
 */

  public void setServiceQuery(BulkParticipantQuery ServiceQueryIn) {
    ServiceQuery = ServiceQueryIn;
  }

  public void translateFromMap() {
    _______BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      _Service = new ServiceObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        _Service[i] = ServiceObjectBaseHelper.getObj((Map) list[i]);
        _Service[i].resetFlags(true, true);
      }
    }
    ___HierarchyId = (Integer)inputMap.get("HierarchyId");
    ___InvElementDef = (Integer)inputMap.get("InvElementDef");
    ___InvSwapElementFileName = (String)inputMap.get("InvSwapElementFileName");
    ___EquipExternalIdFileName = (String)inputMap.get("EquipExternalIdFileName");
    ___GlobalPkgParentAccountInternalId = (Integer)inputMap.get("GlobalPkgParentAccountInternalId");
    ___GenerateWorkflow = (Integer)inputMap.get("GenerateWorkflow");
    ___UDTTemplate = (BulkUdtTemplateRootRequest)inputMap.get("UDTTemplate");
    ___XMLParticipantFileName = (String)inputMap.get("XMLParticipantFileName");
    ___CDFParticipantFileName = (String)inputMap.get("CDFParticipantFileName");
    ___InvElementFileName = (String)inputMap.get("InvElementFileName");
    ___TestParticipantCount = (Integer)inputMap.get("TestParticipantCount");
    ServiceQuery = (BulkParticipantQuery)inputMap.get("ServiceQuery");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _______BatchRequest;
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData[] getService( ) {
    return _Service;
  }

/**
 *
 * Gets the HierarchyId
 * @return Value of the HierarchyId
 *
 */

  public Integer getHierarchyId( ) {
    return ___HierarchyId;
  }

/**
 *
 * Gets the InvElementDef
 * @return Value of the InvElementDef
 *
 */

  public Integer getInvElementDef( ) {
    return ___InvElementDef;
  }

/**
 *
 * Gets the InvSwapElementFileName
 * @return Value of the InvSwapElementFileName
 *
 */

  public String getInvSwapElementFileName( ) {
    return ___InvSwapElementFileName;
  }

/**
 *
 * Gets the EquipExternalIdFileName
 * @return Value of the EquipExternalIdFileName
 *
 */

  public String getEquipExternalIdFileName( ) {
    return ___EquipExternalIdFileName;
  }

/**
 *
 * Gets the GlobalPkgParentAccountInternalId
 * @return Value of the GlobalPkgParentAccountInternalId
 *
 */

  public Integer getGlobalPkgParentAccountInternalId( ) {
    return ___GlobalPkgParentAccountInternalId;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Integer getGenerateWorkflow( ) {
    return ___GenerateWorkflow;
  }

/**
 *
 * Gets the UDTTemplate
 * @return Value of the UDTTemplate
 *
 */

  public BulkUdtTemplateRootRequest getUDTTemplate( ) {
    return ___UDTTemplate;
  }

/**
 *
 * Gets the XMLParticipantFileName
 * @return Value of the XMLParticipantFileName
 *
 */

  public String getXMLParticipantFileName( ) {
    return ___XMLParticipantFileName;
  }

/**
 *
 * Gets the CDFParticipantFileName
 * @return Value of the CDFParticipantFileName
 *
 */

  public String getCDFParticipantFileName( ) {
    return ___CDFParticipantFileName;
  }

/**
 *
 * Gets the InvElementFileName
 * @return Value of the InvElementFileName
 *
 */

  public String getInvElementFileName( ) {
    return ___InvElementFileName;
  }

/**
 *
 * Gets the TestParticipantCount
 * @return Value of the TestParticipantCount
 *
 */

  public Integer getTestParticipantCount( ) {
    return ___TestParticipantCount;
  }

/**
 *
 * Gets the ServiceQuery
 * @return Value of the ServiceQuery
 *
 */

  public BulkParticipantQuery getServiceQuery( ) {
    return ServiceQuery;
  }

}
