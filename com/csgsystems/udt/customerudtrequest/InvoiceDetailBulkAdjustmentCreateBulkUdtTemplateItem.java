/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailBulkAdjustmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailBulkAdjustmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailBulkAdjustmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData _BulkAdjustment;
  protected BatchRequestObjectData _BatchRequest;
  protected InvoiceDetailObjectData[] ____InvoiceDetail;
  protected InvoiceDetailQueryObjectData _InvoiceDetailQuery;
  protected String XMLFileName;
  protected String CDFFileName;
/**
 *
 * Constructor to create a  InvoiceDetailBulkAdjustmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailBulkAdjustmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustmentIn, BatchRequestObjectData _BatchRequestIn, InvoiceDetailObjectData[] ____InvoiceDetailIn, InvoiceDetailQueryObjectData _InvoiceDetailQueryIn, String XMLFileNameIn, String CDFFileNameIn) {
    super(id, context, "InvoiceDetailBulkAdjustmentCreate");
    _BulkAdjustment = _BulkAdjustmentIn;
    _BatchRequest = _BatchRequestIn;
    ____InvoiceDetail = ____InvoiceDetailIn;
    _InvoiceDetailQuery = _InvoiceDetailQueryIn;
    XMLFileName = XMLFileNameIn;
    CDFFileName = CDFFileNameIn;
  }

  public void translateToMap() {
    if (_BulkAdjustment != null) {
      _BulkAdjustment.resetFlags(true, true);
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(_BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_BatchRequest != null) {
      _BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (____InvoiceDetail != null) {
      if (____InvoiceDetail != null) {
        Object[] list = new Object[____InvoiceDetail.length];
        for (int i = 0; i < ____InvoiceDetail.length; i++) {
          list[i] = InvoiceDetailObjectHelper.getMap(____InvoiceDetail[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("InvoiceDetailList", list);
      }
    }
    if (_InvoiceDetailQuery != null) {
      _InvoiceDetailQuery.resetFlags(true, true);
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(_InvoiceDetailQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (XMLFileName != null) {
      addInput("XMLFileName", XMLFileName);
    }
    if (CDFFileName != null) {
      addInput("CDFFileName", CDFFileName);
    }
  }


/**
 *
 * Sets the BulkAdjustment
 * @param _BulkAdjustmentIn Value of the _BulkAdjustment
 *
 */

  public void setBulkAdjustment(BulkAdjustmentObjectData _BulkAdjustmentIn) {
    _BulkAdjustment = _BulkAdjustmentIn;
  }

/**
 *
 * Sets the BatchRequest
 * @param _BatchRequestIn Value of the _BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData _BatchRequestIn) {
    _BatchRequest = _BatchRequestIn;
  }

/**
 *
 * Sets the InvoiceDetail
 * @param ____InvoiceDetailIn Value of the ____InvoiceDetail
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectData[] ____InvoiceDetailIn) {
    ____InvoiceDetail = ____InvoiceDetailIn;
  }

/**
 *
 * Sets the InvoiceDetailQuery
 * @param _InvoiceDetailQueryIn Value of the _InvoiceDetailQuery
 *
 */

  public void setInvoiceDetailQuery(InvoiceDetailQueryObjectData _InvoiceDetailQueryIn) {
    _InvoiceDetailQuery = _InvoiceDetailQueryIn;
  }

/**
 *
 * Sets the XMLFileName
 * @param XMLFileNameIn Value of the XMLFileName
 *
 */

  public void setXMLFileName(String XMLFileNameIn) {
    XMLFileName = XMLFileNameIn;
  }

/**
 *
 * Sets the CDFFileName
 * @param CDFFileNameIn Value of the CDFFileName
 *
 */

  public void setCDFFileName(String CDFFileNameIn) {
    CDFFileName = CDFFileNameIn;
  }

  public void translateFromMap() {
    _BulkAdjustment = BulkAdjustmentObjectHelper.fromMap(inputMap, "BulkAdjustment");
    _BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("InvoiceDetailList");
    if (list != null) {
      ____InvoiceDetail = new InvoiceDetailObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ____InvoiceDetail[i] = InvoiceDetailObjectHelper.getObj((Map) list[i]);
        ____InvoiceDetail[i].resetFlags(true, true);
      }
    }
    _InvoiceDetailQuery = InvoiceDetailQueryObjectHelper.fromMap(inputMap, "InvoiceDetailQuery");
    XMLFileName = (String)inputMap.get("XMLFileName");
    CDFFileName = (String)inputMap.get("CDFFileName");
  }

/**
 *
 * Gets the BulkAdjustment
 * @return Value of the BulkAdjustment
 *
 */

  public BulkAdjustmentObjectData getBulkAdjustment( ) {
    return _BulkAdjustment;
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return _BatchRequest;
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectData[] getInvoiceDetail( ) {
    return ____InvoiceDetail;
  }

/**
 *
 * Gets the InvoiceDetailQuery
 * @return Value of the InvoiceDetailQuery
 *
 */

  public InvoiceDetailQueryObjectData getInvoiceDetailQuery( ) {
    return _InvoiceDetailQuery;
  }

/**
 *
 * Gets the XMLFileName
 * @return Value of the XMLFileName
 *
 */

  public String getXMLFileName( ) {
    return XMLFileName;
  }

/**
 *
 * Gets the CDFFileName
 * @return Value of the CDFFileName
 *
 */

  public String getCDFFileName( ) {
    return CDFFileName;
  }

}
