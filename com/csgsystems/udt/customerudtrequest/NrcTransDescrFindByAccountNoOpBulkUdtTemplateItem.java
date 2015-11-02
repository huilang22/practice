/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrFindByAccountNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NrcTransDescrFindByAccountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTransDescrFindByAccountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTransDescrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcTransDescrFindByAccountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTransDescrFindByAccountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectDataList noOpInIn) {
    super(id, context, "NrcTransDescrFindByAccount");
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
        mapArray[i] = NrcTransDescrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcTransDescr", noOpIn);
      }
      addInput("NrcTransDescr", mapList);
    }
  }
/**
 *
 * Sets the  NrcTransDescr
 * @param noOpInIn NrcTransDescrObjectDataList to set
 *
 */
  public void setNrcTransDescr(NrcTransDescrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTransDescr passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectDataList getNrcTransDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTransDescrObjectHelper.fromMapList(inputMap, "NrcTransDescrList");
  }
}
