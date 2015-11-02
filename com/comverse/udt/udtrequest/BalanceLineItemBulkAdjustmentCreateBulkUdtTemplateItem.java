/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BalanceLineItemBulkAdjustmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemBulkAdjustmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData ____BulkAdjustment;
  protected BatchRequestObjectData ____BatchRequest;
  protected BalanceLineItemObjectData[] _____BalanceLineItem;
  protected BalanceLineItemQueryObjectData ____BalanceLineItemQuery;
  protected String XMLFileName;
  protected String CDFFileName;
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemBulkAdjustmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData ____BulkAdjustmentIn, BatchRequestObjectData ____BatchRequestIn, BalanceLineItemObjectData[] _____BalanceLineItemIn, BalanceLineItemQueryObjectData ____BalanceLineItemQueryIn, String XMLFileNameIn, String CDFFileNameIn) {
    super(id, context, "BalanceLineItemBulkAdjustmentCreate");
    ____BulkAdjustment = ____BulkAdjustmentIn;
    ____BatchRequest = ____BatchRequestIn;
    _____BalanceLineItem = _____BalanceLineItemIn;
    ____BalanceLineItemQuery = ____BalanceLineItemQueryIn;
    XMLFileName = XMLFileNameIn;
    CDFFileName = CDFFileNameIn;
  }

  public void translateToMap() {
    if (____BulkAdjustment != null) {
      ____BulkAdjustment.resetFlags(true, true);
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(____BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (____BatchRequest != null) {
      ____BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BalanceLineItem != null) {
      if (_____BalanceLineItem != null) {
        Object[] list = new Object[_____BalanceLineItem.length];
        for (int i = 0; i < _____BalanceLineItem.length; i++) {
          list[i] = BalanceLineItemObjectHelper.getMap(_____BalanceLineItem[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("BalanceLineItemList", list);
      }
    }
    if (____BalanceLineItemQuery != null) {
      ____BalanceLineItemQuery.resetFlags(true, true);
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(____BalanceLineItemQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * @param ____BulkAdjustmentIn Value of the ____BulkAdjustment
 *
 */

  public void setBulkAdjustment(BulkAdjustmentObjectData ____BulkAdjustmentIn) {
    ____BulkAdjustment = ____BulkAdjustmentIn;
  }

/**
 *
 * Sets the BatchRequest
 * @param ____BatchRequestIn Value of the ____BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData ____BatchRequestIn) {
    ____BatchRequest = ____BatchRequestIn;
  }

/**
 *
 * Sets the BalanceLineItem
 * @param _____BalanceLineItemIn Value of the _____BalanceLineItem
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectData[] _____BalanceLineItemIn) {
    _____BalanceLineItem = _____BalanceLineItemIn;
  }

/**
 *
 * Sets the BalanceLineItemQuery
 * @param ____BalanceLineItemQueryIn Value of the ____BalanceLineItemQuery
 *
 */

  public void setBalanceLineItemQuery(BalanceLineItemQueryObjectData ____BalanceLineItemQueryIn) {
    ____BalanceLineItemQuery = ____BalanceLineItemQueryIn;
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
    ____BulkAdjustment = BulkAdjustmentObjectHelper.fromMap(inputMap, "BulkAdjustment");
    ____BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("BalanceLineItemList");
    if (list != null) {
      _____BalanceLineItem = new BalanceLineItemObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _____BalanceLineItem[i] = BalanceLineItemObjectHelper.getObj((Map) list[i]);
        _____BalanceLineItem[i].resetFlags(true, true);
      }
    }
    ____BalanceLineItemQuery = BalanceLineItemQueryObjectHelper.fromMap(inputMap, "BalanceLineItemQuery");
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
    return ____BulkAdjustment;
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return ____BatchRequest;
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectData[] getBalanceLineItem( ) {
    return _____BalanceLineItem;
  }

/**
 *
 * Gets the BalanceLineItemQuery
 * @return Value of the BalanceLineItemQuery
 *
 */

  public BalanceLineItemQueryObjectData getBalanceLineItemQuery( ) {
    return ____BalanceLineItemQuery;
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
