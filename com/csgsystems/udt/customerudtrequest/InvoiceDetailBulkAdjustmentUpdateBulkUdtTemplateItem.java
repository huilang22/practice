/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailBulkAdjustmentUpdateBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a InvoiceDetailBulkAdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailBulkAdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData ___BulkAdjustment;
  protected BatchRequestObjectData _____BatchRequest;
  protected InvoiceDetailObjectData[] _______InvoiceDetail;
  protected InvoiceDetailQueryObjectData ___InvoiceDetailQuery;
  protected String __XMLFileName;
  protected String __CDFFileName;
/**
 *
 * Constructor to create a  InvoiceDetailBulkAdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailBulkAdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustmentIn, BatchRequestObjectData _____BatchRequestIn, InvoiceDetailObjectData[] _______InvoiceDetailIn, InvoiceDetailQueryObjectData ___InvoiceDetailQueryIn, String __XMLFileNameIn, String __CDFFileNameIn) {
    super(id, context, "InvoiceDetailBulkAdjustmentUpdate");
    ___BulkAdjustment = ___BulkAdjustmentIn;
    _____BatchRequest = _____BatchRequestIn;
    _______InvoiceDetail = _______InvoiceDetailIn;
    ___InvoiceDetailQuery = ___InvoiceDetailQueryIn;
    __XMLFileName = __XMLFileNameIn;
    __CDFFileName = __CDFFileNameIn;
  }

  public void translateToMap() {
    if (___BulkAdjustment != null) {
      ___BulkAdjustment.resetFlags(true, true);
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BatchRequest != null) {
      _____BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_______InvoiceDetail != null) {
      if (_______InvoiceDetail != null) {
        Object[] list = new Object[_______InvoiceDetail.length];
        for (int i = 0; i < _______InvoiceDetail.length; i++) {
          list[i] = InvoiceDetailObjectHelper.getMap(_______InvoiceDetail[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("InvoiceDetailList", list);
      }
    }
    if (___InvoiceDetailQuery != null) {
      ___InvoiceDetailQuery.resetFlags(true, true);
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(___InvoiceDetailQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (__XMLFileName != null) {
      addInput("XMLFileName", __XMLFileName);
    }
    if (__CDFFileName != null) {
      addInput("CDFFileName", __CDFFileName);
    }
  }


/**
 *
 * Sets the BulkAdjustment
 * @param ___BulkAdjustmentIn Value of the ___BulkAdjustment
 *
 */

  public void setBulkAdjustment(BulkAdjustmentObjectData ___BulkAdjustmentIn) {
    ___BulkAdjustment = ___BulkAdjustmentIn;
  }

/**
 *
 * Sets the BatchRequest
 * @param _____BatchRequestIn Value of the _____BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _____BatchRequestIn) {
    _____BatchRequest = _____BatchRequestIn;
  }

/**
 *
 * Sets the InvoiceDetail
 * @param _______InvoiceDetailIn Value of the _______InvoiceDetail
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectData[] _______InvoiceDetailIn) {
    _______InvoiceDetail = _______InvoiceDetailIn;
  }

/**
 *
 * Sets the InvoiceDetailQuery
 * @param ___InvoiceDetailQueryIn Value of the ___InvoiceDetailQuery
 *
 */

  public void setInvoiceDetailQuery(InvoiceDetailQueryObjectData ___InvoiceDetailQueryIn) {
    ___InvoiceDetailQuery = ___InvoiceDetailQueryIn;
  }

/**
 *
 * Sets the XMLFileName
 * @param __XMLFileNameIn Value of the __XMLFileName
 *
 */

  public void setXMLFileName(String __XMLFileNameIn) {
    __XMLFileName = __XMLFileNameIn;
  }

/**
 *
 * Sets the CDFFileName
 * @param __CDFFileNameIn Value of the __CDFFileName
 *
 */

  public void setCDFFileName(String __CDFFileNameIn) {
    __CDFFileName = __CDFFileNameIn;
  }

  public void translateFromMap() {
    ___BulkAdjustment = BulkAdjustmentObjectHelper.fromMap(inputMap, "BulkAdjustment");
    _____BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("InvoiceDetailList");
    if (list != null) {
      _______InvoiceDetail = new InvoiceDetailObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _______InvoiceDetail[i] = InvoiceDetailObjectHelper.getObj((Map) list[i]);
        _______InvoiceDetail[i].resetFlags(true, true);
      }
    }
    ___InvoiceDetailQuery = InvoiceDetailQueryObjectHelper.fromMap(inputMap, "InvoiceDetailQuery");
    __XMLFileName = (String)inputMap.get("XMLFileName");
    __CDFFileName = (String)inputMap.get("CDFFileName");
  }

/**
 *
 * Gets the BulkAdjustment
 * @return Value of the BulkAdjustment
 *
 */

  public BulkAdjustmentObjectData getBulkAdjustment( ) {
    return ___BulkAdjustment;
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _____BatchRequest;
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectData[] getInvoiceDetail( ) {
    return _______InvoiceDetail;
  }

/**
 *
 * Gets the InvoiceDetailQuery
 * @return Value of the InvoiceDetailQuery
 *
 */

  public InvoiceDetailQueryObjectData getInvoiceDetailQuery( ) {
    return ___InvoiceDetailQuery;
  }

/**
 *
 * Gets the XMLFileName
 * @return Value of the XMLFileName
 *
 */

  public String getXMLFileName( ) {
    return __XMLFileName;
  }

/**
 *
 * Gets the CDFFileName
 * @return Value of the CDFFileName
 *
 */

  public String getCDFFileName( ) {
    return __CDFFileName;
  }

}
