/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemBulkAdjustmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemBulkAdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemBulkAdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData ___BulkAdjustment;
  protected BatchRequestObjectData ______BatchRequest;
  protected BalanceLineItemObjectData[] ________BalanceLineItem;
  protected BalanceLineItemQueryObjectData __BalanceLineItemQuery;
  protected String __XMLFileName;
  protected String __CDFFileName;
/**
 *
 * Constructor to create a  BalanceLineItemBulkAdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemBulkAdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustmentIn, BatchRequestObjectData ______BatchRequestIn, BalanceLineItemObjectData[] ________BalanceLineItemIn, BalanceLineItemQueryObjectData __BalanceLineItemQueryIn, String __XMLFileNameIn, String __CDFFileNameIn) {
    super(id, context, "BalanceLineItemBulkAdjustmentUpdate");
    ___BulkAdjustment = ___BulkAdjustmentIn;
    ______BatchRequest = ______BatchRequestIn;
    ________BalanceLineItem = ________BalanceLineItemIn;
    __BalanceLineItemQuery = __BalanceLineItemQueryIn;
    __XMLFileName = __XMLFileNameIn;
    __CDFFileName = __CDFFileNameIn;
  }

  public void translateToMap() {
    if (___BulkAdjustment != null) {
      ___BulkAdjustment.resetFlags(true, true);
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (______BatchRequest != null) {
      ______BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(______BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (________BalanceLineItem != null) {
      if (________BalanceLineItem != null) {
        Object[] list = new Object[________BalanceLineItem.length];
        for (int i = 0; i < ________BalanceLineItem.length; i++) {
          list[i] = BalanceLineItemObjectHelper.getMap(________BalanceLineItem[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("BalanceLineItemList", list);
      }
    }
    if (__BalanceLineItemQuery != null) {
      __BalanceLineItemQuery.resetFlags(true, true);
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(__BalanceLineItemQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * @param ______BatchRequestIn Value of the ______BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData ______BatchRequestIn) {
    ______BatchRequest = ______BatchRequestIn;
  }

/**
 *
 * Sets the BalanceLineItem
 * @param ________BalanceLineItemIn Value of the ________BalanceLineItem
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectData[] ________BalanceLineItemIn) {
    ________BalanceLineItem = ________BalanceLineItemIn;
  }

/**
 *
 * Sets the BalanceLineItemQuery
 * @param __BalanceLineItemQueryIn Value of the __BalanceLineItemQuery
 *
 */

  public void setBalanceLineItemQuery(BalanceLineItemQueryObjectData __BalanceLineItemQueryIn) {
    __BalanceLineItemQuery = __BalanceLineItemQueryIn;
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
    ______BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    Object[] list = (Object[]) inputMap.get("BalanceLineItemList");
    if (list != null) {
      ________BalanceLineItem = new BalanceLineItemObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ________BalanceLineItem[i] = BalanceLineItemObjectHelper.getObj((Map) list[i]);
        ________BalanceLineItem[i].resetFlags(true, true);
      }
    }
    __BalanceLineItemQuery = BalanceLineItemQueryObjectHelper.fromMap(inputMap, "BalanceLineItemQuery");
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
    return ______BatchRequest;
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectData[] getBalanceLineItem( ) {
    return ________BalanceLineItem;
  }

/**
 *
 * Gets the BalanceLineItemQuery
 * @return Value of the BalanceLineItemQuery
 *
 */

  public BalanceLineItemQueryObjectData getBalanceLineItemQuery( ) {
    return __BalanceLineItemQuery;
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
