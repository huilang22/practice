/*
 * Generated code DO NOT EDIT
 * Generated file: BulkOrderRequestByServiceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BulkOrderRequestByServiceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BulkOrderRequestByServiceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData ___________BatchRequest;
  protected ServiceObjectBaseData[] ______Service;
  protected Integer _____HierarchyId;
  protected Integer _____InvElementDef;
  protected String _____InvSwapElementFileName;
  protected String _____EquipExternalIdFileName;
  protected Integer _____GlobalPkgParentAccountInternalId;
  protected Integer _____GenerateWorkflow;
  protected BulkUdtTemplateRootRequest _____UDTTemplate;
  protected String _____XMLParticipantFileName;
  protected String _____CDFParticipantFileName;
  protected String _____InvElementFileName;
  protected Integer _____TestParticipantCount;
  protected BulkParticipantQuery __ServiceQuery;
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BulkOrderRequestByServiceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData ___________BatchRequestIn, ServiceObjectBaseData[] ______ServiceIn, Integer _____HierarchyIdIn, Integer _____InvElementDefIn, String _____InvSwapElementFileNameIn, String _____EquipExternalIdFileNameIn, Integer _____GlobalPkgParentAccountInternalIdIn, Integer _____GenerateWorkflowIn, BulkUdtTemplateRootRequest _____UDTTemplateIn, String _____XMLParticipantFileNameIn, String _____CDFParticipantFileNameIn, String _____InvElementFileNameIn, Integer _____TestParticipantCountIn, BulkParticipantQuery __ServiceQueryIn) {
    super(id, context, "BulkOrderRequestByServiceUpdate");
    ___________BatchRequest = ___________BatchRequestIn;
    ______Service = ______ServiceIn;
    _____HierarchyId = _____HierarchyIdIn;
    _____InvElementDef = _____InvElementDefIn;
    _____InvSwapElementFileName = _____InvSwapElementFileNameIn;
    _____EquipExternalIdFileName = _____EquipExternalIdFileNameIn;
    _____GlobalPkgParentAccountInternalId = _____GlobalPkgParentAccountInternalIdIn;
    _____GenerateWorkflow = _____GenerateWorkflowIn;
    _____UDTTemplate = _____UDTTemplateIn;
    _____XMLParticipantFileName = _____XMLParticipantFileNameIn;
    _____CDFParticipantFileName = _____CDFParticipantFileNameIn;
    _____InvElementFileName = _____InvElementFileNameIn;
    _____TestParticipantCount = _____TestParticipantCountIn;
    __ServiceQuery = __ServiceQueryIn;
  }

  public void translateToMap() {
    if (___________BatchRequest != null) {
      ___________BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___________BatchRequest, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
    if (______Service != null) {
      if (______Service != null) {
        Object[] list = new Object[______Service.length];
        for (int i = 0; i < ______Service.length; i++) {
          list[i] = ServiceObjectBaseHelper.getMap(______Service[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BulkOrderRequest");
        }
        addInput("ServiceList", list);
      }
    }
    if (_____HierarchyId != null) {
      addInput("HierarchyId", _____HierarchyId);
    }
    if (_____InvElementDef != null) {
      addInput("InvElementDef", _____InvElementDef);
    }
    if (_____InvSwapElementFileName != null) {
      addInput("InvSwapElementFileName", _____InvSwapElementFileName);
    }
    if (_____EquipExternalIdFileName != null) {
      addInput("EquipExternalIdFileName", _____EquipExternalIdFileName);
    }
    if (_____GlobalPkgParentAccountInternalId != null) {
      addInput("GlobalPkgParentAccountInternalId", _____GlobalPkgParentAccountInternalId);
    }
    if (_____GenerateWorkflow != null) {
      addInput("GenerateWorkflow", _____GenerateWorkflow);
    }
    if (_____UDTTemplate != null) {
      addInput("UDTTemplate", _____UDTTemplate);
    }
    if (_____XMLParticipantFileName != null) {
      addInput("XMLParticipantFileName", _____XMLParticipantFileName);
    }
    if (_____CDFParticipantFileName != null) {
      addInput("CDFParticipantFileName", _____CDFParticipantFileName);
    }
    if (_____InvElementFileName != null) {
      addInput("InvElementFileName", _____InvElementFileName);
    }
    if (_____TestParticipantCount != null) {
      addInput("TestParticipantCount", _____TestParticipantCount);
    }
    if (__ServiceQuery != null) {
      addInput("ServiceQuery", __ServiceQuery);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param ___________BatchRequestIn Value of the ___________BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData ___________BatchRequestIn) {
    ___________BatchRequest = ___________BatchRequestIn;
  }

/**
 *
 * Sets the Service
 * @param ______ServiceIn Value of the ______Service
 *
 */

  public void setService(ServiceObjectBaseData[] ______ServiceIn) {
    ______Service = ______ServiceIn;
  }

/**
 *
 * Sets the HierarchyId
 * @param _____HierarchyIdIn Value of the _____HierarchyId
 *
 */

  public void setHierarchyId(Integer _____HierarchyIdIn) {
    _____HierarchyId = _____HierarchyIdIn;
  }

/**
 *
 * Sets the InvElementDef
 * @param _____InvElementDefIn Value of the _____InvElementDef
 *
 */

  public void setInvElementDef(Integer _____InvElementDefIn) {
    _____InvElementDef = _____InvElementDefIn;
  }

/**
 *
 * Sets the InvSwapElementFileName
 * @param _____InvSwapElementFileNameIn Value of the _____InvSwapElementFileName
 *
 */

  public void setInvSwapElementFileName(String _____InvSwapElementFileNameIn) {
    _____InvSwapElementFileName = _____InvSwapElementFileNameIn;
  }

/**
 *
 * Sets the EquipExternalIdFileName
 * @param _____EquipExternalIdFileNameIn Value of the _____EquipExternalIdFileName
 *
 */

  public void setEquipExternalIdFileName(String _____EquipExternalIdFileNameIn) {
    _____EquipExternalIdFileName = _____EquipExternalIdFileNameIn;
  }

/**
 *
 * Sets the GlobalPkgParentAccountInternalId
 * @param _____GlobalPkgParentAccountInternalIdIn Value of the _____GlobalPkgParentAccountInternalId
 *
 */

  public void setGlobalPkgParentAccountInternalId(Integer _____GlobalPkgParentAccountInternalIdIn) {
    _____GlobalPkgParentAccountInternalId = _____GlobalPkgParentAccountInternalIdIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param _____GenerateWorkflowIn Value of the _____GenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Integer _____GenerateWorkflowIn) {
    _____GenerateWorkflow = _____GenerateWorkflowIn;
  }

/**
 *
 * Sets the UDTTemplate
 * @param _____UDTTemplateIn Value of the _____UDTTemplate
 *
 */

  public void setUDTTemplate(BulkUdtTemplateRootRequest _____UDTTemplateIn) {
    _____UDTTemplate = _____UDTTemplateIn;
  }

/**
 *
 * Sets the XMLParticipantFileName
 * @param _____XMLParticipantFileNameIn Value of the _____XMLParticipantFileName
 *
 */

  public void setXMLParticipantFileName(String _____XMLParticipantFileNameIn) {
    _____XMLParticipantFileName = _____XMLParticipantFileNameIn;
  }

/**
 *
 * Sets the CDFParticipantFileName
 * @param _____CDFParticipantFileNameIn Value of the _____CDFParticipantFileName
 *
 */

  public void setCDFParticipantFileName(String _____CDFParticipantFileNameIn) {
    _____CDFParticipantFileName = _____CDFParticipantFileNameIn;
  }

/**
 *
 * Sets the InvElementFileName
 * @param _____InvElementFileNameIn Value of the _____InvElementFileName
 *
 */

  public void setInvElementFileName(String _____InvElementFileNameIn) {
    _____InvElementFileName = _____InvElementFileNameIn;
  }

/**
 *
 * Sets the TestParticipantCount
 * @param _____TestParticipantCountIn Value of the _____TestParticipantCount
 *
 */

  public void setTestParticipantCount(Integer _____TestParticipantCountIn) {
    _____TestParticipantCount = _____TestParticipantCountIn;
  }

/**
 *
 * Sets the ServiceQuery
 * @param __ServiceQueryIn Value of the __ServiceQuery
 *
 */

  public void setServiceQuery(BulkParticipantQuery __ServiceQueryIn) {
    __ServiceQuery = __ServiceQueryIn;
  }

  public void translateFromMap() {
    ___________BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      ______Service = new ServiceObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        ______Service[i] = ServiceObjectBaseHelper.getObj((Map) list[i]);
        ______Service[i].resetFlags(true, true);
      }
    }
    _____HierarchyId = (Integer)inputMap.get("HierarchyId");
    _____InvElementDef = (Integer)inputMap.get("InvElementDef");
    _____InvSwapElementFileName = (String)inputMap.get("InvSwapElementFileName");
    _____EquipExternalIdFileName = (String)inputMap.get("EquipExternalIdFileName");
    _____GlobalPkgParentAccountInternalId = (Integer)inputMap.get("GlobalPkgParentAccountInternalId");
    _____GenerateWorkflow = (Integer)inputMap.get("GenerateWorkflow");
    _____UDTTemplate = (BulkUdtTemplateRootRequest)inputMap.get("UDTTemplate");
    _____XMLParticipantFileName = (String)inputMap.get("XMLParticipantFileName");
    _____CDFParticipantFileName = (String)inputMap.get("CDFParticipantFileName");
    _____InvElementFileName = (String)inputMap.get("InvElementFileName");
    _____TestParticipantCount = (Integer)inputMap.get("TestParticipantCount");
    __ServiceQuery = (BulkParticipantQuery)inputMap.get("ServiceQuery");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return ___________BatchRequest;
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData[] getService( ) {
    return ______Service;
  }

/**
 *
 * Gets the HierarchyId
 * @return Value of the HierarchyId
 *
 */

  public Integer getHierarchyId( ) {
    return _____HierarchyId;
  }

/**
 *
 * Gets the InvElementDef
 * @return Value of the InvElementDef
 *
 */

  public Integer getInvElementDef( ) {
    return _____InvElementDef;
  }

/**
 *
 * Gets the InvSwapElementFileName
 * @return Value of the InvSwapElementFileName
 *
 */

  public String getInvSwapElementFileName( ) {
    return _____InvSwapElementFileName;
  }

/**
 *
 * Gets the EquipExternalIdFileName
 * @return Value of the EquipExternalIdFileName
 *
 */

  public String getEquipExternalIdFileName( ) {
    return _____EquipExternalIdFileName;
  }

/**
 *
 * Gets the GlobalPkgParentAccountInternalId
 * @return Value of the GlobalPkgParentAccountInternalId
 *
 */

  public Integer getGlobalPkgParentAccountInternalId( ) {
    return _____GlobalPkgParentAccountInternalId;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Integer getGenerateWorkflow( ) {
    return _____GenerateWorkflow;
  }

/**
 *
 * Gets the UDTTemplate
 * @return Value of the UDTTemplate
 *
 */

  public BulkUdtTemplateRootRequest getUDTTemplate( ) {
    return _____UDTTemplate;
  }

/**
 *
 * Gets the XMLParticipantFileName
 * @return Value of the XMLParticipantFileName
 *
 */

  public String getXMLParticipantFileName( ) {
    return _____XMLParticipantFileName;
  }

/**
 *
 * Gets the CDFParticipantFileName
 * @return Value of the CDFParticipantFileName
 *
 */

  public String getCDFParticipantFileName( ) {
    return _____CDFParticipantFileName;
  }

/**
 *
 * Gets the InvElementFileName
 * @return Value of the InvElementFileName
 *
 */

  public String getInvElementFileName( ) {
    return _____InvElementFileName;
  }

/**
 *
 * Gets the TestParticipantCount
 * @return Value of the TestParticipantCount
 *
 */

  public Integer getTestParticipantCount( ) {
    return _____TestParticipantCount;
  }

/**
 *
 * Gets the ServiceQuery
 * @return Value of the ServiceQuery
 *
 */

  public BulkParticipantQuery getServiceQuery( ) {
    return __ServiceQuery;
  }

}
