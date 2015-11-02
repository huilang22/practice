/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData ___BulkAdjustment;
  protected BatchRequestObjectData _____BatchRequest;
  protected BilledUsageObjectData[] _______BilledUsage;
  protected BilledUsageQueryObjectData ____BilledUsageQuery;
  protected String __XMLFileName;
  protected String __CDFFileName;
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustmentIn, BatchRequestObjectData _____BatchRequestIn, BilledUsageObjectData[] _______BilledUsageIn, BilledUsageQueryObjectData ____BilledUsageQueryIn, String __XMLFileNameIn, String __CDFFileNameIn) {
    super(id, context, "BilledUsageBulkAdjustmentUpdate");
    ___BulkAdjustment = ___BulkAdjustmentIn;
    _____BatchRequest = _____BatchRequestIn;
    _______BilledUsage = _______BilledUsageIn;
    ____BilledUsageQuery = ____BilledUsageQueryIn;
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
    if (_______BilledUsage != null) {
      if (_______BilledUsage != null) {
        Object[] list = new Object[_______BilledUsage.length];
        for (int i = 0; i < _______BilledUsage.length; i++) {
          list[i] = BilledUsageObjectHelper.getMap(_______BilledUsage[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("BilledUsageList", list);
      }
    }
    if (____BilledUsageQuery != null) {
      ____BilledUsageQuery.resetFlags(true, true);
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(____BilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Sets the BilledUsage
 * @param _______BilledUsageIn Value of the _______BilledUsage
 *
 */

  public void setBilledUsage(BilledUsageObjectData[] _______BilledUsageIn) {
    _______BilledUsage = _______BilledUsageIn;
  }

/**
 *
 * Sets the BilledUsageQuery
 * @param ____BilledUsageQueryIn Value of the ____BilledUsageQuery
 *
 */

  public void setBilledUsageQuery(BilledUsageQueryObjectData ____BilledUsageQueryIn) {
    ____BilledUsageQuery = ____BilledUsageQueryIn;
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
    Object[] list = (Object[]) inputMap.get("BilledUsageList");
    if (list != null) {
      _______BilledUsage = new BilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _______BilledUsage[i] = BilledUsageObjectHelper.getObj((Map) list[i]);
        _______BilledUsage[i].resetFlags(true, true);
      }
    }
    ____BilledUsageQuery = BilledUsageQueryObjectHelper.fromMap(inputMap, "BilledUsageQuery");
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
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectData[] getBilledUsage( ) {
    return _______BilledUsage;
  }

/**
 *
 * Gets the BilledUsageQuery
 * @return Value of the BilledUsageQuery
 *
 */

  public BilledUsageQueryObjectData getBilledUsageQuery( ) {
    return ____BilledUsageQuery;
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
