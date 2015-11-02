/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData ___BulkAdjustment;
  protected BatchRequestObjectData _____BatchRequest;
  protected UnbilledUsageObjectData[] _______UnbilledUsage;
  protected UnbilledUsageQueryObjectData ___UnbilledUsageQuery;
  protected String __XMLFileName;
  protected String __CDFFileName;
/**
 *
 * Constructor to create a  UnbilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageBulkAdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData ___BulkAdjustmentIn, BatchRequestObjectData _____BatchRequestIn, UnbilledUsageObjectData[] _______UnbilledUsageIn, UnbilledUsageQueryObjectData ___UnbilledUsageQueryIn, String __XMLFileNameIn, String __CDFFileNameIn) {
    super(id, context, "UnbilledUsageBulkAdjustmentUpdate");
    ___BulkAdjustment = ___BulkAdjustmentIn;
    _____BatchRequest = _____BatchRequestIn;
    _______UnbilledUsage = _______UnbilledUsageIn;
    ___UnbilledUsageQuery = ___UnbilledUsageQueryIn;
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
    if (_______UnbilledUsage != null) {
      if (_______UnbilledUsage != null) {
        Object[] list = new Object[_______UnbilledUsage.length];
        for (int i = 0; i < _______UnbilledUsage.length; i++) {
          list[i] = UnbilledUsageObjectHelper.getMap(_______UnbilledUsage[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("UnbilledUsageList", list);
      }
    }
    if (___UnbilledUsageQuery != null) {
      ___UnbilledUsageQuery.resetFlags(true, true);
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(___UnbilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Sets the UnbilledUsage
 * @param _______UnbilledUsageIn Value of the _______UnbilledUsage
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectData[] _______UnbilledUsageIn) {
    _______UnbilledUsage = _______UnbilledUsageIn;
  }

/**
 *
 * Sets the UnbilledUsageQuery
 * @param ___UnbilledUsageQueryIn Value of the ___UnbilledUsageQuery
 *
 */

  public void setUnbilledUsageQuery(UnbilledUsageQueryObjectData ___UnbilledUsageQueryIn) {
    ___UnbilledUsageQuery = ___UnbilledUsageQueryIn;
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
    Object[] list = (Object[]) inputMap.get("UnbilledUsageList");
    if (list != null) {
      _______UnbilledUsage = new UnbilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _______UnbilledUsage[i] = UnbilledUsageObjectHelper.getObj((Map) list[i]);
        _______UnbilledUsage[i].resetFlags(true, true);
      }
    }
    ___UnbilledUsageQuery = UnbilledUsageQueryObjectHelper.fromMap(inputMap, "UnbilledUsageQuery");
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
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectData[] getUnbilledUsage( ) {
    return _______UnbilledUsage;
  }

/**
 *
 * Gets the UnbilledUsageQuery
 * @return Value of the UnbilledUsageQuery
 *
 */

  public UnbilledUsageQueryObjectData getUnbilledUsageQuery( ) {
    return ___UnbilledUsageQuery;
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
