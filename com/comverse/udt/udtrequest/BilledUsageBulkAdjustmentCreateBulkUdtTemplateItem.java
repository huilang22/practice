/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageBulkAdjustmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageBulkAdjustmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageBulkAdjustmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData _BulkAdjustment;
  protected BatchRequestObjectData _BatchRequest;
  protected BilledUsageObjectData[] _____BilledUsage;
  protected BilledUsageQueryObjectData _BilledUsageQuery;
  protected String XMLFileName;
  protected String CDFFileName;
/**
 *
 * Constructor to create a  BilledUsageBulkAdjustmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageBulkAdjustmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustmentIn, BatchRequestObjectData _BatchRequestIn, BilledUsageObjectData[] _____BilledUsageIn, BilledUsageQueryObjectData _BilledUsageQueryIn, String XMLFileNameIn, String CDFFileNameIn) {
    super(id, context, "BilledUsageBulkAdjustmentCreate");
    _BulkAdjustment = _BulkAdjustmentIn;
    _BatchRequest = _BatchRequestIn;
    _____BilledUsage = _____BilledUsageIn;
    _BilledUsageQuery = _BilledUsageQueryIn;
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
    if (_____BilledUsage != null) {
      if (_____BilledUsage != null) {
        Object[] list = new Object[_____BilledUsage.length];
        for (int i = 0; i < _____BilledUsage.length; i++) {
          list[i] = BilledUsageObjectHelper.getMap(_____BilledUsage[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("BilledUsageList", list);
      }
    }
    if (_BilledUsageQuery != null) {
      _BilledUsageQuery.resetFlags(true, true);
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(_BilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Sets the BilledUsage
 * @param _____BilledUsageIn Value of the _____BilledUsage
 *
 */

  public void setBilledUsage(BilledUsageObjectData[] _____BilledUsageIn) {
    _____BilledUsage = _____BilledUsageIn;
  }

/**
 *
 * Sets the BilledUsageQuery
 * @param _BilledUsageQueryIn Value of the _BilledUsageQuery
 *
 */

  public void setBilledUsageQuery(BilledUsageQueryObjectData _BilledUsageQueryIn) {
    _BilledUsageQuery = _BilledUsageQueryIn;
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
    Object[] list = (Object[]) inputMap.get("BilledUsageList");
    if (list != null) {
      _____BilledUsage = new BilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _____BilledUsage[i] = BilledUsageObjectHelper.getObj((Map) list[i]);
        _____BilledUsage[i].resetFlags(true, true);
      }
    }
    _BilledUsageQuery = BilledUsageQueryObjectHelper.fromMap(inputMap, "BilledUsageQuery");
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
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectData[] getBilledUsage( ) {
    return _____BilledUsage;
  }

/**
 *
 * Gets the BilledUsageQuery
 * @return Value of the BilledUsageQuery
 *
 */

  public BilledUsageQueryObjectData getBilledUsageQuery( ) {
    return _BilledUsageQuery;
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
