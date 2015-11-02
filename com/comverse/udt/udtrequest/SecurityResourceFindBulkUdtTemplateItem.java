/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceFindBulkUdtTemplateItem.java
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
 * Class used to create a SecurityResourceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityResourceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityResourceObjectFilter SECFindIn;
/**
 *
 * Constructor to create a  SecurityResourceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityResourceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectFilter SECFindInIn) {
    super(id, context, "SecurityResourceFind");
    SECFindIn = SECFindInIn;
  }

  public void translateToMap() {
    if (SECFindIn != null) {
      Integer index =  SECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECFindIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }


/**
 *
 * Sets the SecurityResource
 * @param SECFindInIn Value of the SECFindIn
 *
 */

  public void setSecurityResource(SecurityResourceObjectFilter SECFindInIn) {
    SECFindIn = SECFindInIn;
  }

  public void translateFromMap() {
    SECFindIn = SecurityResourceObjectHelper.fromMapFilter(inputMap, "SecurityResource");
  }

/**
 *
 * Gets the SecurityResource
 * @return Value of the SecurityResource
 *
 */

  public SecurityResourceObjectFilter getSecurityResource( ) {
    return SECFindIn;
  }

}
