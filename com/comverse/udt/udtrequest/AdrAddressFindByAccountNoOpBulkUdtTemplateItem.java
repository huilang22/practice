/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindByAccountNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AdrAddressFindByAccountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdrAddressFindByAccountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdrAddressObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdrAddressFindByAccountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdrAddressFindByAccountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectDataList noOpInIn) {
    super(id, context, "AdrAddressFindByAccount");
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
        mapArray[i] = AdrAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdrAddress", noOpIn);
      }
      addInput("AdrAddress", mapList);
    }
  }
/**
 *
 * Sets the  AdrAddress
 * @param noOpInIn AdrAddressObjectDataList to set
 *
 */
  public void setAdrAddress(AdrAddressObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdrAddress passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressObjectDataList getAdrAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdrAddressObjectHelper.fromMapList(inputMap, "AdrAddressList");
  }
}
