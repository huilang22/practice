/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EmfConfigAddressCategoryMapUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigAddressCategoryMapUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EmfConfigAddressCategoryMapObjectData noOpIn;

/**
 *
 * Constructor to create a   EmfConfigAddressCategoryMapUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigAddressCategoryMapUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectData noOpInIn) {
    super(id, context, "EmfConfigAddressCategoryMapUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }
/**
 *
 * Sets the  EmfConfigAddressCategoryMap
 * @param noOpInIn EmfConfigAddressCategoryMapObjectData to set
 *
 */
  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfigAddressCategoryMap passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigAddressCategoryMapObjectData getEmfConfigAddressCategoryMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EmfConfigAddressCategoryMapObjectHelper.fromMap(inputMap, "EmfConfigAddressCategoryMap");
  }
}
