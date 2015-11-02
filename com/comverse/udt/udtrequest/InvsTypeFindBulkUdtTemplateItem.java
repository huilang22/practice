/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeObjectFilter InvsTypeFindIn;
/**
 *
 * Constructor to create a  InvsTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectFilter InvsTypeFindInIn) {
    super(id, context, "InvsTypeFind");
    InvsTypeFindIn = InvsTypeFindInIn;
  }

  public void translateToMap() {
    if (InvsTypeFindIn != null) {
      Integer index =  InvsTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeFindIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }


/**
 *
 * Sets the InvsType
 * @param InvsTypeFindInIn Value of the InvsTypeFindIn
 *
 */

  public void setInvsType(InvsTypeObjectFilter InvsTypeFindInIn) {
    InvsTypeFindIn = InvsTypeFindInIn;
  }

  public void translateFromMap() {
    InvsTypeFindIn = InvsTypeObjectHelper.fromMapFilter(inputMap, "InvsType");
  }

/**
 *
 * Gets the InvsType
 * @return Value of the InvsType
 *
 */

  public InvsTypeObjectFilter getInvsType( ) {
    return InvsTypeFindIn;
  }

}
