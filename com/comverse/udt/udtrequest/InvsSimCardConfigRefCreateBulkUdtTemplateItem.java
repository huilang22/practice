/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSimCardConfigRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigRefObjectData InvsSimCardConfigRefCreateIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectData InvsSimCardConfigRefCreateInIn) {
    super(id, context, "InvsSimCardConfigRefCreate");
    InvsSimCardConfigRefCreateIn = InvsSimCardConfigRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigRefCreateIn != null) {
      InvsSimCardConfigRefCreateIn.resetFlags(true, true);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefCreateIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfigRef
 * @param InvsSimCardConfigRefCreateInIn Value of the InvsSimCardConfigRefCreateIn
 *
 */

  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectData InvsSimCardConfigRefCreateInIn) {
    InvsSimCardConfigRefCreateIn = InvsSimCardConfigRefCreateInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigRefCreateIn = InvsSimCardConfigRefObjectHelper.fromMap(inputMap, "InvsSimCardConfigRef");
  }

/**
 *
 * Gets the InvsSimCardConfigRef
 * @return Value of the InvsSimCardConfigRef
 *
 */

  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRef( ) {
    return InvsSimCardConfigRefCreateIn;
  }

}
