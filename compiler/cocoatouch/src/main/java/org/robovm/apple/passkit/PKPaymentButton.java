/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.passkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentButtonPtr extends Ptr<PKPaymentButton, PKPaymentButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentButton() {}
    protected PKPaymentButton(Handle h, long handle) { super(h, handle); }
    protected PKPaymentButton(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithPaymentButtonType:paymentButtonStyle:")
    public PKPaymentButton(PKPaymentButtonType type, PKPaymentButtonStyle style) { super((SkipInit) null); initObject(init(type, style)); }
    @Method(selector = "initWithFrame:")
    public PKPaymentButton(@ByVal org.robovm.apple.coregraphics.CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PKPaymentButton(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "cornerRadius")
    public native double getCornerRadius();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setCornerRadius:")
    public native void setCornerRadius(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithPaymentButtonType:paymentButtonStyle:")
    protected native @Pointer long init(PKPaymentButtonType type, PKPaymentButtonStyle style);
    /*</methods>*/
}
