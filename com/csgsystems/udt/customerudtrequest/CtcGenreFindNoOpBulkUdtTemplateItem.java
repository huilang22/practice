/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcGenreFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGenreFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGenreObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcGenreFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGenreFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectDataList noOpInIn) {
    super(id, context, "CtcGenreFind");
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
        mapArray[i] = CtcGenreObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcGenre", noOpIn);
      }
      addInput("CtcGenre", mapList);
    }
  }
/**
 *
 * Sets the  CtcGenre
 * @param noOpInIn CtcGenreObjectDataList to set
 *
 */
  public void setCtcGenre(CtcGenreObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcGenre passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGenreObjectDataList getCtcGenre() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcGenreObjectHelper.fromMapList(inputMap, "CtcGenreList");
  }
}
