/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GenericEnumerationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenericEnumerationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GEObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GenericEnumerationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenericEnumerationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectDataList noOpInIn) {
    super(id, context, "GenericEnumerationFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = GEObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GenericEnumeration", noOpIn);
      }
      addInput("GenericEnumeration", mapList);
    }
  }
/**
 *
 * Sets the  GenericEnumeration
 * @param noOpInIn GEObjectDataList to set
 *
 */
  public void setGenericEnumeration(GEObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenericEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public GEObjectDataList getGenericEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GEObjectHelper.fromMapList(inputMap, "GenericEnumerationList");
  }
}
