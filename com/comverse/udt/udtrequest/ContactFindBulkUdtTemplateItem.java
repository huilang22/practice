/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactFindBulkUdtTemplateItem.java
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
 * Class used to create a ContactFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ContactFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContactObjectFilter ContactfindIn;
/**
 *
 * Constructor to create a  ContactFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContactFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectFilter ContactfindInIn) {
    super(id, context, "ContactFind");
    ContactfindIn = ContactfindInIn;
  }

  public void translateToMap() {
    if (ContactfindIn != null) {
      Integer index =  ContactfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Contact", ContactObjectHelper.toMap(ContactfindIn, new HashMap(), "Contact").get("Contact"));
    }
  }


/**
 *
 * Sets the Contact
 * @param ContactfindInIn Value of the ContactfindIn
 *
 */

  public void setContact(ContactObjectFilter ContactfindInIn) {
    ContactfindIn = ContactfindInIn;
  }

  public void translateFromMap() {
    ContactfindIn = ContactObjectHelper.fromMapFilter(inputMap, "Contact");
  }

/**
 *
 * Gets the Contact
 * @return Value of the Contact
 *
 */

  public ContactObjectFilter getContact( ) {
    return ContactfindIn;
  }

}
