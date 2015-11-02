/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcFeedFileFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFeedFileFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFeedFileObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcFeedFileFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFeedFileFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectDataList noOpInIn) {
    super(id, context, "CtcFeedFileFind");
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
        mapArray[i] = CtcFeedFileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFeedFile", noOpIn);
      }
      addInput("CtcFeedFile", mapList);
    }
  }
/**
 *
 * Sets the  CtcFeedFile
 * @param noOpInIn CtcFeedFileObjectDataList to set
 *
 */
  public void setCtcFeedFile(CtcFeedFileObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFeedFile passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFeedFileObjectDataList getCtcFeedFile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFeedFileObjectHelper.fromMapList(inputMap, "CtcFeedFileList");
  }
}
