/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucFindBulkUdtTemplateItem.java
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
 * Class used to create a AbiNrcDucFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiNrcDucFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiNrcDucObjectFilter AbiNrcDucFindIn;
/**
 *
 * Constructor to create a  AbiNrcDucFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiNrcDucFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiNrcDucObjectFilter AbiNrcDucFindInIn) {
    super(id, context, "AbiNrcDucFind");
    AbiNrcDucFindIn = AbiNrcDucFindInIn;
  }

  public void translateToMap() {
    if (AbiNrcDucFindIn != null) {
      Integer index =  AbiNrcDucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(AbiNrcDucFindIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }


/**
 *
 * Sets the AbiNrcDuc
 * @param AbiNrcDucFindInIn Value of the AbiNrcDucFindIn
 *
 */

  public void setAbiNrcDuc(AbiNrcDucObjectFilter AbiNrcDucFindInIn) {
    AbiNrcDucFindIn = AbiNrcDucFindInIn;
  }

  public void translateFromMap() {
    AbiNrcDucFindIn = AbiNrcDucObjectHelper.fromMapFilter(inputMap, "AbiNrcDuc");
  }

/**
 *
 * Gets the AbiNrcDuc
 * @return Value of the AbiNrcDuc
 *
 */

  public AbiNrcDucObjectFilter getAbiNrcDuc( ) {
    return AbiNrcDucFindIn;
  }

}
