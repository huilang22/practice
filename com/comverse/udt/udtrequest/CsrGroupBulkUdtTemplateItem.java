/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String user_name;
/**
 *
 * Constructor to create a  CsrGroupBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupBulkUdtTemplateItem(String id, BSDMSessionContext context, String user_nameIn) {
    super(id, context, "CsrGroup");
    user_name = user_nameIn;
  }

  public void translateToMap() {
    if (user_name != null) {
      addInput("UserName", user_name);
    }
  }


/**
 *
 * Sets the UserName
 * @param user_nameIn Value of the user_name
 *
 */

  public void setUserName(String user_nameIn) {
    user_name = user_nameIn;
  }

  public void translateFromMap() {
    user_name = (String)inputMap.get("UserName");
  }

/**
 *
 * Gets the UserName
 * @return Value of the UserName
 *
 */

  public String getUserName( ) {
    return user_name;
  }

}
