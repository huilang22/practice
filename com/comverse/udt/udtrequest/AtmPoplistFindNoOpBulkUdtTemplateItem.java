/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a AtmPoplistFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AtmPoplistFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AtmPoplistObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AtmPoplistFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AtmPoplistFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectDataList noOpInIn) {
    super(id, context, "AtmPoplistFind");
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
        mapArray[i] = AtmPoplistObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AtmPoplist", noOpIn);
      }
      addInput("AtmPoplist", mapList);
    }
  }
/**
 *
 * Sets the  AtmPoplist
 * @param noOpInIn AtmPoplistObjectDataList to set
 *
 */
  public void setAtmPoplist(AtmPoplistObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AtmPoplist passed into the constructor
 * @return Simulated response
 *
 */
  public AtmPoplistObjectDataList getAtmPoplist() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AtmPoplistObjectHelper.fromMapList(inputMap, "AtmPoplistList");
  }
}
