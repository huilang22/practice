/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageBulkAdjustmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageBulkAdjustmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageBulkAdjustmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BulkAdjustmentObjectData _BulkAdjustment;
  protected BatchRequestObjectData _BatchRequest;
  protected UnbilledUsageObjectData[] _____UnbilledUsage;
  protected UnbilledUsageQueryObjectData _UnbilledUsageQuery;
  protected String XMLFileName;
  protected String CDFFileName;
/**
 *
 * Constructor to create a  UnbilledUsageBulkAdjustmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageBulkAdjustmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkAdjustmentObjectData _BulkAdjustmentIn, BatchRequestObjectData _BatchRequestIn, UnbilledUsageObjectData[] _____UnbilledUsageIn, UnbilledUsageQueryObjectData _UnbilledUsageQueryIn, String XMLFileNameIn, String CDFFileNameIn) {
    super(id, context, "UnbilledUsageBulkAdjustmentCreate");
    _BulkAdjustment = _BulkAdjustmentIn;
    _BatchRequest = _BatchRequestIn;
    _____UnbilledUsage = _____UnbilledUsageIn;
    _UnbilledUsageQuery = _UnbilledUsageQueryIn;
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
    if (_____UnbilledUsage != null) {
      if (_____UnbilledUsage != null) {
        Object[] list = new Object[_____UnbilledUsage.length];
        for (int i = 0; i < _____UnbilledUsage.length; i++) {
          list[i] = UnbilledUsageObjectHelper.getMap(_____UnbilledUsage[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "BatchRequest");
        }
        addInput("UnbilledUsageList", list);
      }
    }
    if (_UnbilledUsageQuery != null) {
      _UnbilledUsageQuery.resetFlags(true, true);
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(_UnbilledUsageQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
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
 * Sets the UnbilledUsage
 * @param _____UnbilledUsageIn Value of the _____UnbilledUsage
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectData[] _____UnbilledUsageIn) {
    _____UnbilledUsage = _____UnbilledUsageIn;
  }

/**
 *
 * Sets the UnbilledUsageQuery
 * @param _UnbilledUsageQueryIn Value of the _UnbilledUsageQuery
 *
 */

  public void setUnbilledUsageQuery(UnbilledUsageQueryObjectData _UnbilledUsageQueryIn) {
    _UnbilledUsageQuery = _UnbilledUsageQueryIn;
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
    Object[] list = (Object[]) inputMap.get("UnbilledUsageList");
    if (list != null) {
      _____UnbilledUsage = new UnbilledUsageObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _____UnbilledUsage[i] = UnbilledUsageObjectHelper.getObj((Map) list[i]);
        _____UnbilledUsage[i].resetFlags(true, true);
      }
    }
    _UnbilledUsageQuery = UnbilledUsageQueryObjectHelper.fromMap(inputMap, "UnbilledUsageQuery");
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
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectData[] getUnbilledUsage( ) {
    return _____UnbilledUsage;
  }

/**
 *
 * Gets the UnbilledUsageQuery
 * @return Value of the UnbilledUsageQuery
 *
 */

  public UnbilledUsageQueryObjectData getUnbilledUsageQuery( ) {
    return _UnbilledUsageQuery;
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
