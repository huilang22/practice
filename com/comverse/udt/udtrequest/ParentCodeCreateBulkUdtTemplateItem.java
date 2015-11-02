/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ParentCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ParentCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ParentCodeObjectData ParentCodeCreateIn;
/**
 *
 * Constructor to create a  ParentCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ParentCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectData ParentCodeCreateInIn) {
    super(id, context, "ParentCodeCreate");
    ParentCodeCreateIn = ParentCodeCreateInIn;
  }

  public void translateToMap() {
    if (ParentCodeCreateIn != null) {
      ParentCodeCreateIn.resetFlags(true, true);
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeCreateIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }


/**
 *
 * Sets the ParentCode
 * @param ParentCodeCreateInIn Value of the ParentCodeCreateIn
 *
 */

  public void setParentCode(ParentCodeObjectData ParentCodeCreateInIn) {
    ParentCodeCreateIn = ParentCodeCreateInIn;
  }

  public void translateFromMap() {
    ParentCodeCreateIn = ParentCodeObjectHelper.fromMap(inputMap, "ParentCode");
  }

/**
 *
 * Gets the ParentCode
 * @return Value of the ParentCode
 *
 */

  public ParentCodeObjectData getParentCode( ) {
    return ParentCodeCreateIn;
  }

}
